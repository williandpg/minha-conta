package com.betrybe.minhaconta.presentation;

import com.betrybe.minhaconta.business.EnergyAccount;
import com.betrybe.minhaconta.business.EnergyBill;
import com.ions.lightdealer.sdk.model.Address;
import com.ions.lightdealer.sdk.model.Client;
import com.ions.lightdealer.sdk.model.ElectronicDevice;
import com.ions.lightdealer.sdk.service.LightDealerApi;

/**
 * The type Application.
 */
public class Application {

  ConsoleUserInterface ui;
  LightDealerApi api;

  /**
   * Constructor that instantiates a new Application.
   */
  public Application(ConsoleUserInterface ui) {
    this.ui = ui;
    this.api = new LightDealerApi();
  }

  /**
   * Req. 4 – Creates CLI menu.
   */
  public void run() {
    char runOption = ' ';
    while (runOption != '6') {
      String[] runMenu;
      runMenu = new String[] {
          "1 - Cadastrar cliente",
          "2 - Cadastrar imóvel de cliente",
          "3 - Cadastrar dispositivos em imóvel",
          "4 - Estimar conta de imóvel",
          "5 - Otimizar uso de energia",
          "6 - Sair"
      };
      runOption = ui.inputMenuOption(runMenu);
      runOptionAction(runOption);
    }
  }

  /**
   * Req. 5 – Run menu options.
   */
  public void runOptionAction(char option) {
    switch (option) {
      case '1':
        registerClient();
        break;
      case '2':
        registerClientAddress();
        break;
      case '3':
        registerAddressDevices();
        break;
      case '4':
        estimateAddressBill();
        break;
      case '5':
        optimizeEnergyBill();
        break;
      case '6':
        ui.showMessage("Volte sempre!");
        break;
      default:
        ui.showMessage("Opção inválida!");
    }
  }

  /**
   * Req. 6 – Register client.
   */
  public void registerClient() {
    Client client = new Client();
    ui.fillClientData(client);
    api.addClient(client);
  }

  /**
   * Req. 7 – Register client address.
   */
  public void registerClientAddress() {
    String cpf = ui.inputClientCpf();
    Client client = api.findClient(cpf);
    if (client == null) {
      ui.showMessage("Pessoa cliente não encontrada!");
    }
    Address address = new Address();
    ui.fillAddressData(address);
    api.addAddressToClient(address, client);
  }

  /**
   * Req. 8 – Register address devices.
   */
  public void registerAddressDevices() {
    String register = ui.inputAddressRegistration();
    Address address = api.findAddress(register);
    if (address == null) {
      ui.showMessage("Endereço não encontrado!");
    }
    int devices = ui.inputNumberOfDevices();

    for (int i = 0; i <= devices; i++) {
      ElectronicDevice electronicDevice = new ElectronicDevice();
      ui.fillDeviceData(electronicDevice);
      api.addDeviceToAddress(electronicDevice, address);
    }
  }

  /**
   * Req. 9 – Estimates the address energy bill.
   */
  public void estimateAddressBill() {
    String estimate = ui.inputAddressRegistration();
    Address address = api.findAddress(estimate);
    if (estimate == null) {
      ui.showMessage("Endereço não encontrado!");
    }
    EnergyBill energyBill = new EnergyBill(address, true);
    double value = energyBill.estimate();
    ui.showMessage("Valor estimado para a conta: " + value);
  }

  /**
   * Req. 10 – Optimizes the energy bill.
   */
  public void optimizeEnergyBill() {
  }

  /**
   * Req 10 - Aux. Method to display high consumptions devices.
   */
  public void suggestReducedUsage(EnergyAccount energyAccount) {
  }
}

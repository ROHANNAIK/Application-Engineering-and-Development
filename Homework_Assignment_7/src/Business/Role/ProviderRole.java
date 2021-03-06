/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.ProviderOrganization;
import Business.Organization.SupplierOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Distributor.Provider.ProviderAdminWorkAreaJPanel;
import userinterface.Distributor.Supplier.SupplierAdminWorkAreaJPanel;

/**
 *
 * @author pooji
 */
public class ProviderRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
         return new ProviderAdminWorkAreaJPanel(userProcessContainer,  account, (ProviderOrganization) organization,  enterprise,  business);
    }
    
}

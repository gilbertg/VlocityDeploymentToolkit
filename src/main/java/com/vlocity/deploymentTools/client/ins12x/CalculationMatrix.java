package com.vlocity.deploymentTools.client.ins12x;

import com.vlocity.deploymentTools.client.ArtifactTypeEnum;
import com.vlocity.deploymentTools.client.VlocityArtifact;

import java.util.ArrayList;

/**
 * Created by Derek on 29/06/2016.
 */
public class CalculationMatrix extends VlocityArtifact {
    public CalculationMatrix(ArtifactTypeEnum artifactType, String packageName, String packageVersion) {
        super(artifactType, packageName, packageVersion);

        this.FieldDefinitions = new ArrayList<VlocityArtifactFieldDefinition>() {{
            add(new VlocityArtifactFieldDefinition("Name", "Name", FieldTypeEnum.STRING, false, true, false));
            add(new VlocityArtifactFieldDefinition("Vlocity_Calculation_Table_Versions__r", "CalculationMatrixVersions", FieldTypeEnum.LIST_OF_VLOCITY_ARTIFACT, ArtifactTypeEnum.CALCULATION_MATRIX_VERSION));
        }};
    }

    @Override
    public void onAfterDeserialisation() {

    }

    @Override
    public void onBeforeSerialisation() {

    }

    @Override
    public void onAfterRetrieve() throws Exception {

    }

    @Override
    public void onBeforeDeploy() {

    }

    @Override
    public String getSObjectTypeName() {
        return "CalculationMatrix__c";
    }

    @Override
    public String getDataPackType() { return ""; }

    @Override
    public Boolean hasDataPack() { return false; }

}

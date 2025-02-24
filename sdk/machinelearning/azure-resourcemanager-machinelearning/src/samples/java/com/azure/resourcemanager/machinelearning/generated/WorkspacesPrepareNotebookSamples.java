// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.Context;

/** Samples for Workspaces PrepareNotebook. */
public final class WorkspacesPrepareNotebookSamples {
    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/stable/2022-10-01/examples/Notebook/prepare.json
     */
    /**
     * Sample code: Prepare Notebook.
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void prepareNotebook(com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager.workspaces().prepareNotebook("testrg123", "workspaces123", Context.NONE);
    }
}

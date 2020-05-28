/*
 *
 *  * Copyright (c) 2020. MobilityData IO.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *     http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package org.mobilitydata.gtfsvalidator.usecase;

import org.mobilitydata.gtfsvalidator.domain.entity.FileSpecificUsecase;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Use case to retrieve the list of use cases to execute in order to process to validation of GTFS dataset
 */
public class GetUsecaseCollectionForFile {
    private final Map<String, List<FileSpecificUsecase>> usecaseByFilename;

    public GetUsecaseCollectionForFile(final Map<String, List<FileSpecificUsecase>> usecaseByFilename) {
        this.usecaseByFilename = usecaseByFilename;
    }

    /**
     * Use case execution method: returns the list of use cases to execute in order to process to validation of GTFS
     * dataset
     *
     * @param filenameListToProcess the list of files to validate
     * @return the list of use cases to execute
     */
    public List<FileSpecificUsecase> execute(final List<String> filenameListToProcess) {
        final List<FileSpecificUsecase> toReturn = new ArrayList<>();
        filenameListToProcess.forEach(filename ->
                toReturn.addAll(usecaseByFilename.get(filename)));
        return toReturn;
    }
}
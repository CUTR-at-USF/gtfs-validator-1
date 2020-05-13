/*
 * Copyright (c) 2020. MobilityData IO.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.mobilitydata.gtfsvalidator.usecase;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GenerateFilenameListToProcessTest {

    @Test
    void executionMethodShouldReturnEmptyList() {
        final List<String> toExclude = List.of("file0", "file1", "file2");
        final List<String> toProcess = List.of("file0", "file1", "file2");

        final GenerateFilenameListToProcess underTest = new GenerateFilenameListToProcess();

        assertEquals(new ArrayList<>(), underTest.execute(toExclude, toProcess));
    }

    @Test
    void executionMethodShouldReturnListOfSize1() {
        final List<String> toExclude = List.of("file0", "file1");
        final List<String> toProcess = List.of("file0", "file1", "file2");

        final GenerateFilenameListToProcess underTest = new GenerateFilenameListToProcess();
        assertEquals(List.of("file2"), underTest.execute(toExclude, toProcess));
    }

    @Test
    void executionMethodShouldReturnListOfSize2() {
        final List<String> toExclude = List.of("file0");
        final List<String> toProcess = List.of("file0", "file1", "file2");

        final GenerateFilenameListToProcess underTest = new GenerateFilenameListToProcess();
        assertEquals(List.of("file1", "file2"), underTest.execute(toExclude, toProcess));
    }

    @Test
    void executionMethodShouldReturnListOfSize3() {
        final List<String> toProcess = List.of("file0", "file1", "file2");
        final List<String> toExclude = List.of();

        final GenerateFilenameListToProcess underTest = new GenerateFilenameListToProcess();
        assertEquals(List.of("file0", "file1", "file2"), underTest.execute(toExclude, toProcess));
    }
}
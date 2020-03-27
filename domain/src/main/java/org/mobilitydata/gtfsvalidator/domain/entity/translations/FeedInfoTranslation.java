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

package org.mobilitydata.gtfsvalidator.domain.entity.translations;

import org.jetbrains.annotations.NotNull;

public class FeedInfoTranslation extends TableNameBase {

    private FeedInfoTranslation(@NotNull String fieldName,
                                @NotNull String language,
                                @NotNull String translation) {
        super(fieldName, language, translation);
    }

    public static class FeedInfoTranslationBuilder extends TableNameBaseBuilder {

        public FeedInfoTranslationBuilder(@NotNull final String fieldName,
                                          @NotNull final String language,
                                          @NotNull final String translation) {
            super(fieldName, language, translation);
        }

        public FeedInfoTranslation build() {
            return new FeedInfoTranslation(fieldName, language, translation);
        }
    }
}
package org.mobilitydata.gtfsvalidator.usecase.port;

import org.mobilitydata.gtfsvalidator.domain.entity.RawFileInfo;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;

public interface RawFileRepository {

    RawFileInfo create(RawFileInfo fileInfo);

    Optional<RawFileInfo> findByName(String filename);

    Collection<String> getActualHeadersForFile(RawFileInfo file);

    Set<String> getFilenameAll();
}
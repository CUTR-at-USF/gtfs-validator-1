package org.mobilitydata.gtfsvalidator.usecase.notice.base;

import org.mobilitydata.gtfsvalidator.usecase.port.ValidationResultRepository;

public abstract class Notice {
    protected String filename;
    protected String noticeId;
    protected String title;
    protected String description;

    protected Notice(final String filename,
                     final String noticeId,
                     final String title,
                     final String description) {
        this.filename = filename;
        this.noticeId = noticeId;
        this.title = title;
        this.description = description;
    }

    public abstract Notice visit(ValidationResultRepository resultRepo);

    public String getFilename() {
        return filename;
    }

    public String getId() {
        return noticeId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "\nNotice{" +
                "filename='" + filename + '\'' +
                ", noticeId='" + noticeId + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
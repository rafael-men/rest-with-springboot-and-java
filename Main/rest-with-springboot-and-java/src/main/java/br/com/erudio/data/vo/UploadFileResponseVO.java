package br.com.erudio.data.vo;

import java.io.Serializable;

public class UploadFileResponseVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String fileName;
    private String fileDownloadUri;
    private String fileType;
    private long Size;

    public UploadFileResponseVO(String fileDownloadUri, long size, String fileType, String fileName) {
        this.fileDownloadUri = fileDownloadUri;
        Size = size;
        this.fileType = fileType;
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileDownloadUri() {
        return fileDownloadUri;
    }

    public void setFileDownloadUri(String fileDownloadUri) {
        this.fileDownloadUri = fileDownloadUri;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public long getSize() {
        return Size;
    }

    public void setSize(long size) {
        Size = size;
    }
}

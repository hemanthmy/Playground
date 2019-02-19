package com.htnameh.kata;

/**
 * @author hemanth
 * @since 17/1/19
 */
public class ExtractFileName {

    public static void main(String[] args) {
        System.out.println(extractFileName("1231231223123131_FILE_NAME.EXTENSION.OTHEREXTENSION"));
        System.out.println(extractFileName("1_FILE_NAME.EXTENSION.OTHEREXTENSIONadasdassdassds34"));
    }

    private static String extractFileName(String dirtyFileName) {
        int start = dirtyFileName.indexOf("_");
        int end = dirtyFileName.lastIndexOf(".");

        return dirtyFileName.substring(start + 1, end);
    }

}
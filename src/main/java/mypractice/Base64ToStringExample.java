package mypractice;

import java.util.Base64;

public class Base64ToStringExample {
    public static void main(String[] args) {
        // Correct Base64-encoded string (removing line breaks)
        String base64Content = "JVBERi0xLjcKJeLjz9MKNSAwIG9iago8PC9GaWx0ZXIvRmxhdGVEZWNvZGUvTGVuZ3RoIDEzMD4+c3RyZWFtCnicK+RyCuHSdzNUMDRSCEnjMjZTMLcw1jM3UQhJ4dJwzS3Iya9MTVXwTFmgYKVgqBmSxeUawhXIVYipy9RczxJNl19ibipQm2NWZkkGPq3GRnqGaFodU1KKUouLgbp9E1NKixIz8ek3MNMzhuj3yc/PLi2AWexdmptYBNcIAPNsPB4KZW5kc3RyZWFtCmVuZG9iago0IDAgb2JqCjw8L0NvbnRlbnRzIDUgMCBSL01lZGlhQm94WzAgMCA1OTUgODQyXS9QYXJlbnQgMiAwIFIvUmVzb3VyY2VzPDwvRm9udDw8L0YxIDYgMCBSPj4+Pi9UcmltQm94WzAgMCA1OTUgODQyXS9UeXBlL1BhZ2U+PgplbmRvYmoKMSAwIG9iago8PC9QYWdlcyAyIDAgUi9UeXBlL0NhdGFsb2c+PgplbmRvYmoKMyAwIG9iago8PC9DcmVhdGlvbkRhdGUoRDoyMDI0MTEyODE1MjI1MyswNSczMCcpL01vZERhdGUoRDoyMDI0MTEyODE1MjI1MyswNSczMCcpL1Byb2R1Y2VyKGlUZXh0riA3LjEuMTMgqTIwMDAtMjAyMCBpVGV4dCBHcm91cCBOViBcKEFHUEwtdmVyc2lvblwpKT4+CmVuZG9iago2IDAgb2JqCjw8L0Jhc2VGb250L1RpbWVzLVJvbWFuL0VuY29kaW5nL1dpbkFuc2lFbmNvZGluZy9TdWJ0eXBlL1R5cGUxL1R5cGUvRm9udD4+CmVuZG9iagoyIDAgb2JqCjw8L0NvdW50IDEvS2lkc1s0IDAgUl0vVHlwZS9QYWdlcz4+CmVuZG9iagp4cmVmCjAgNwowMDAwMDAwMDAwIDY1NTM1IGYgCjAwMDAwMDAzNDUgMDAwMDAgbiAKMDAwMDAwMDYzOCAwMDAwMCBuIAowMDAwMDAwMzkwIDAwMDAwIG4gCjAwMDAwMDAyMTIgMDAwMDAgbiAKMDAwMDAwMDAxNSAwMDAwMCBuIAowMDAwMDAwNTQ4IDAwMDAwIG4gCnRyYWlsZXIKPDwvSUQgWzAzMWIwYzBhY2QxOTAxNzM0YTA0YWU1NzkzZDc5NDYzNz48MzFiMGMwYWNkMTkwMTczNGEwNGFlNTc5M2Q3OTQ2Mzc+XS9JbmZvIDMgMCBSL1Jvb3QgMSAwIFIvU2l6ZSA3Pj4KJWlUZXh0LTcuMS4xMwpzdGFydHhyZWYKNjg5CiUlRU9GCg==";

        // Decode the Base64 string
        byte[] decodedBytes = Base64.getDecoder().decode(base64Content);

        // Convert bytes to a readable string
        String decodedString = new String(decodedBytes);

        // Print the decoded string
        System.out.println("Decoded String: ");
        System.out.println(decodedString);
    }
}

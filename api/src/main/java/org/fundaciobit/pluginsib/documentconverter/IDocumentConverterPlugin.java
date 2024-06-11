package org.fundaciobit.pluginsib.documentconverter;

import java.io.InputStream;
import java.io.OutputStream;

import org.fundaciobit.pluginsib.core.v3.IPluginIB;

/**
 * 
 * @author anadal
 * 
 */
public interface IDocumentConverterPlugin extends IPluginIB {

    public static final String DOCUMENTCONVERTER_BASE_PROPERTY = IPLUGINSIB_BASE_PROPERTIES + "documentconverter.";

    public void convertDocumentByExtension(InputStream inputData, String inputFileExtension, OutputStream outputData,
            String outputFileExtension)
            throws InputDocumentNotSupportedException, OutputDocumentNotSupportedException, ConversionDocumentException;

    public void convertDocumentByMime(InputStream inputData, String inputMime, OutputStream outputData,
            String outputMime)
            throws InputDocumentNotSupportedException, OutputDocumentNotSupportedException, ConversionDocumentException;

    public boolean isFileExtensionSupported(String fileExtension);

    public boolean isMimeTypeSupported(String mimeType);

}

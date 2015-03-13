package edu.uci.ics.asterix.external.library;

import edu.uci.ics.asterix.external.library.java.JObjects.JRecord;
import edu.uci.ics.asterix.external.library.udf.featuregeneration.DocumentEntityFeature;
import edu.uci.ics.asterix.external.library.udf.featuregeneration.DocumentFeature;

public class DocumentEntityFeatureExtractionFunction extends AbstractFeatureExtractionFunction {
    
    @Override
    public void initialize(IFunctionHelper functionHelper) throws Exception {
        this.docFeature = new DocumentEntityFeature(searcher);     
        
        // Initialize the searcher
        initializeSearcher();
        
        // Get the field positions
        initializeFieldPositions((JRecord) functionHelper.getArgument(0));
    }
}

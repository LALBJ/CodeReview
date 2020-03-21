package homework4;

public class NoXMLFacade extends AbstractFacade {
    NoXMLFileReader noXMLFileReader;
    dataDisplay dataDisplay;
    dataProcess dataProcess;
    NoXMLFacade(){
        noXMLFileReader = new NoXMLFileReader();
        dataDisplay = new dataDisplay();
        dataProcess = new dataProcess();
    }
    @Override
    public void execute() {
        noXMLFileReader.read();
        dataProcess.process();
        dataDisplay.display();
    }
}

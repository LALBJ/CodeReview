package homework4;

public class XMLFacade extends AbstractFacade {
    XMLFileReader xmlFileReader;
    dataProcess dataProcess;
    dataDisplay dataDisplay;
    XMLFacade(){
        xmlFileReader = new XMLFileReader();
        dataProcess = new dataProcess();
        dataDisplay = new dataDisplay();
    }
    @Override
    public void execute() {
        xmlFileReader.read();
        dataProcess.process();
        dataDisplay.display();
    }
}

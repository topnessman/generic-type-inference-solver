package generalconstraintsolver.dataflowsolver.dataflowlogiqlsolver;

import java.io.File;
import java.io.PrintWriter;

import dataflow.util.DataflowUtils;
import generalconstraintsolver.dataflowsolver.DataflowImpliesLogic;
import generalconstraintsolver.logiqlsubsolver.LogiqlDataGenerator;

public class LogiqlDataflowDataGenerator extends LogiqlDataGenerator {

    private final String path;
    private final DataflowImpliesLogic logic;

    public LogiqlDataflowDataGenerator(DataflowImpliesLogic logic,
            String path) {
        super(logic.getLogics(), path);
        this.path = path;
        this.logic = logic;
    }

    @Override
    protected void writeFile(String output) {
        try {
            String writePath = path + "/"
                    + DataflowUtils.getTypeNames(logic.getLattice().top)[0]
                    + ".logic";
            File f = new File(writePath);
            PrintWriter pw = new PrintWriter(f);
            pw.write(output);
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

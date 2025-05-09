package Projeto;

public class demanda {
    private int tip;
    private int dised;
    private int diseq;
    private int custr;
    private int custim;
    private int prepr;
    private int regula;
    private int prejfisc;
    private int tempesp;

    public demanda(int tip, int dised, int diseq, int custr, int custim, int prepr, int regula, int prejfisc,
            int tempesp) {
        this.tip = tip;
        this.dised = dised;
        this.diseq = diseq;
        this.custr = custr;
        this.custim = custim;
        this.prepr = prepr;
        this.regula = regula;
        this.prejfisc = prejfisc;
        this.tempesp = tempesp;
    }

    public int calcularPrioridade() {
        return tip + dised + diseq + custr + custim + prepr + regula + prejfisc + tempesp;
    }

    @Override
    public String toString() {
        return "Demanda [prioridade=" + calcularPrioridade() + ", tip=" + tip + ", dised=" + dised + ", diseq=" + diseq
                +
                ", custr=" + custr + ", custim=" + custim + ", prepr=" + prepr + ", regula=" + regula +
                ", prejfisc=" + prejfisc + ", tempesp=" + tempesp + "]";
    }
}

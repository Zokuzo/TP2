public class pokemon {
    private int num_national;
    private String name;
    private String type;
    private int level;
    private int hp;
    private int atk;
    private int def;
    private int atk_spe;
    private int def_spe;
    private int speed;

    public pokemon(int num_national, String name, String type, int level, int hp, int atk, int def, int atk_spe, int def_spe, int speed) {
        this.num_national = num_national;
        this.name = name;
        this.type = type;
        this.level = level;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.atk_spe = atk_spe;
        this.def_spe = def_spe;
        this.speed = speed;
    }

    public int getNumNational() {
        return num_national;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public int getAtkSpe() {
        return atk_spe;
    }

    public int getDefSpe() {
        return def_spe;
    }

    public int getSpeed() {
        return speed;
    }

    public void setNumNational(int num_national) {
        this.num_national = num_national;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public void setAtkSpe(int atk_spe) {
        this.atk_spe = atk_spe;
    }

    public void setDefSpe(int def_spe) {
        this.def_spe = def_spe;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String toString() {
        return ("National Number: " + num_national + "\nName: " + name + "\nType: " + type + "\nLevel: " + level + "\nHP: " + hp + "\nAttack: " + atk + "\nDefense: " + def + "\nSpecial Attack: " + atk_spe + "\nSpecial Defense: " + def_spe + "\nSpeed: " + speed);
    }

    public double calculerDommage(pokemon adversaire) {
        double dommage = ((2.0 * (double)this.level + 10) / 250.0) * ((double) this.atk / (double)adversaire.getDef()) + 2;
        return (double) dommage;
    }


}

package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ti2 extends n79 {
    public ti2(char c) {
        super(Character.valueOf(c));
    }

    @Override // defpackage.il4
    public final yr9 a(tqb tqbVar) {
        tqbVar.getClass();
        or9 or9VarF = tqbVar.f();
        or9VarF.getClass();
        return or9VarF.r(vfd.CHAR);
    }

    @Override // defpackage.il4
    public final String toString() {
        String strValueOf;
        Object obj = this.a;
        Integer numValueOf = Integer.valueOf(((Character) obj).charValue());
        char cCharValue = ((Character) obj).charValue();
        if (cCharValue == '\b') {
            strValueOf = "\\b";
        } else if (cCharValue == '\t') {
            strValueOf = "\\t";
        } else if (cCharValue == '\n') {
            strValueOf = "\\n";
        } else if (cCharValue == '\f') {
            strValueOf = "\\f";
        } else if (cCharValue == '\r') {
            strValueOf = "\\r";
        } else {
            byte type = (byte) Character.getType(cCharValue);
            strValueOf = (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? "?" : String.valueOf(cCharValue);
        }
        return String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{numValueOf, strValueOf}, 2));
    }
}

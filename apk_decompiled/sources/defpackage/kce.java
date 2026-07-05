package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class kce {
    public jm9 a(l08 l08Var) {
        return l08Var;
    }

    public pl9 b(Class cls) {
        return new nh3(cls);
    }

    public fm9 c(Class cls, String str) {
        return new bnc(cls, str);
    }

    public rm9 d(awb awbVar) {
        return awbVar;
    }

    public um9 e(bwb bwbVar) {
        return bwbVar;
    }

    public kn9 f(lrd lrdVar) {
        return lrdVar;
    }

    public on9 g(mrd mrdVar) {
        return mrdVar;
    }

    public sn9 h(nrd nrdVar) {
        return nrdVar;
    }

    public String i(a08 a08Var) {
        String string = a08Var.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String j(ts9 ts9Var) {
        return i(ts9Var);
    }

    public eo9 k(pl9 pl9Var) {
        List list = Collections.EMPTY_LIST;
        return new yai(pl9Var);
    }
}

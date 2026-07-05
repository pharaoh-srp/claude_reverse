package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gme {
    public final int a;
    public final int b;

    public gme(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final boolean c(kdg kdgVar) {
        List list;
        kdgVar.getClass();
        Object objO0 = w44.O0(this.a, kdgVar);
        uhd uhdVar = objO0 instanceof uhd ? (uhd) objO0 : null;
        if (uhdVar == null || (list = uhdVar.e) == null) {
            return false;
        }
        int size = list.size() - 1;
        int i = this.b;
        if (i != size) {
            Object objO02 = w44.O0(i + 1, list);
            itc itcVar = objO02 instanceof itc ? (itc) objO02 : null;
            String str = itcVar != null ? itcVar.a : null;
            if (str != null && !bsg.I0(str)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gme)) {
            return false;
        }
        gme gmeVar = (gme) obj;
        return this.a == gmeVar.a && this.b == gmeVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return vb7.q("ResearchToolInvocationIndex(messageIndex=", ", blockIndex=", this.a, this.b, ")");
    }
}

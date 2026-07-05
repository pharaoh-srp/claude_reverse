package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ota implements w79 {
    public final zy7 a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final hr7 c;

    public ota(zub zubVar, zy7 zy7Var) {
        this.a = zy7Var;
        this.c = new hr7(zubVar.a, 1, this);
    }

    @Override // defpackage.w79
    public final kp7 a() {
        return this.c;
    }
}

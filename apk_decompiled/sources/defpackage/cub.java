package defpackage;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class cub implements nyg, Serializable {
    public final int E;

    public cub() {
        fok.c(2, "expectedValuesPerKey");
        this.E = 2;
    }

    @Override // defpackage.nyg
    public final Object get() {
        return new ArrayList(this.E);
    }
}

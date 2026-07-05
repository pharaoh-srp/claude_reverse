package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import okio.Path;

/* JADX INFO: loaded from: classes2.dex */
public final class o66 {
    public final String a;
    public final long[] b = new long[2];
    public final ArrayList c = new ArrayList(2);
    public final ArrayList d = new ArrayList(2);
    public boolean e;
    public boolean f;
    public s31 g;
    public int h;
    public final /* synthetic */ u66 i;

    public o66(u66 u66Var, String str) {
        this.i = u66Var;
        this.a = str;
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.c.add(this.i.E.e(sb.toString()));
            sb.append(".tmp");
            this.d.add(this.i.E.e(sb.toString()));
            sb.setLength(length);
        }
    }

    public final q66 a() {
        if (!this.e || this.g != null || this.f) {
            return null;
        }
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            u66 u66Var = this.i;
            if (i >= size) {
                this.h++;
                return new q66(u66Var, this);
            }
            if (!u66Var.U.n((Path) arrayList.get(i))) {
                try {
                    u66Var.H(this);
                } catch (IOException unused) {
                }
                return null;
            }
            i++;
        }
    }
}

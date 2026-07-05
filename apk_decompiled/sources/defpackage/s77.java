package defpackage;

import android.media.MediaFormat;

/* JADX INFO: loaded from: classes2.dex */
public final class s77 implements jui, b7d {
    public jui E;
    public s77 F;

    public final void a() {
        s77 s77Var = this.F;
        if (s77Var != null) {
            s77Var.a();
        }
    }

    @Override // defpackage.jui
    public final void b(long j, long j2, jw7 jw7Var, MediaFormat mediaFormat) {
        jui juiVar = this.E;
        if (juiVar != null) {
            juiVar.b(j, j2, jw7Var, mediaFormat);
        }
    }

    public final void c() {
        s77 s77Var = this.F;
        if (s77Var != null) {
            s77Var.c();
        }
    }

    @Override // defpackage.b7d
    public final void d(int i, Object obj) {
        if (i == 7) {
            this.E = (jui) obj;
            return;
        }
        if (i == 8) {
            this.F = (s77) obj;
        } else if (i == 10000 && obj != null) {
            mr9.o();
        }
    }
}

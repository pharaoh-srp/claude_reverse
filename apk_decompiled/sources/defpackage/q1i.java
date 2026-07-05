package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class q1i extends nik {
    public final /* synthetic */ int f;
    public boolean g;
    public int h;
    public final /* synthetic */ Object i;

    public q1i(hyi hyiVar) {
        this.f = 1;
        this.i = hyiVar;
        this.g = false;
        this.h = 0;
    }

    @Override // defpackage.nik, defpackage.iyi
    public void a() {
        switch (this.f) {
            case 0:
                this.g = true;
                break;
        }
    }

    @Override // defpackage.nik, defpackage.iyi
    public final void b() {
        int i = this.f;
        Object obj = this.i;
        switch (i) {
            case 0:
                ((r1i) obj).a.setVisibility(0);
                break;
            default:
                if (!this.g) {
                    this.g = true;
                    iyi iyiVar = ((hyi) obj).d;
                    if (iyiVar != null) {
                        iyiVar.b();
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.iyi
    public final void c() {
        int i = this.f;
        Object obj = this.i;
        switch (i) {
            case 0:
                if (!this.g) {
                    ((r1i) obj).a.setVisibility(this.h);
                }
                break;
            default:
                int i2 = this.h + 1;
                this.h = i2;
                hyi hyiVar = (hyi) obj;
                if (i2 == hyiVar.a.size()) {
                    iyi iyiVar = hyiVar.d;
                    if (iyiVar != null) {
                        iyiVar.c();
                    }
                    this.h = 0;
                    this.g = false;
                    hyiVar.e = false;
                }
                break;
        }
    }

    public q1i(r1i r1iVar, int i) {
        this.f = 0;
        this.i = r1iVar;
        this.h = i;
        this.g = false;
    }
}

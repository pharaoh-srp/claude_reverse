package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class a35 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ e8d G;
    public final /* synthetic */ zeh H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a35(e8d e8dVar, zeh zehVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = e8dVar;
        this.H = zehVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new a35(this.G, this.H, tp4Var, 0);
            case 1:
                return new a35(this.G, this.H, tp4Var, 1);
            default:
                return new a35(this.G, this.H, tp4Var, 2);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((a35) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        e8d e8dVar = this.G;
        final zeh zehVar = this.H;
        m45 m45Var = m45.E;
        iei ieiVar = iei.a;
        final int i2 = 1;
        switch (i) {
            case 0:
                int i3 = this.F;
                if (i3 != 0) {
                    if (i3 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        sf5.h0(obj);
                    }
                    break;
                } else {
                    sf5.h0(obj);
                    this.F = 1;
                    if (jik.c(e8dVar, zehVar, this) == m45Var) {
                    }
                }
                break;
            case 1:
                int i4 = this.F;
                if (i4 != 0) {
                    if (i4 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        sf5.h0(obj);
                    }
                    break;
                } else {
                    sf5.h0(obj);
                    this.F = 1;
                    Object objF = pok.f(e8dVar, new f(zehVar, null, 5), this);
                    if (objF != m45Var) {
                        objF = ieiVar;
                    }
                    if (objF == m45Var) {
                    }
                }
                break;
            default:
                int i5 = this.F;
                if (i5 != 0) {
                    if (i5 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        sf5.h0(obj);
                    }
                    break;
                } else {
                    sf5.h0(obj);
                    this.F = 1;
                    final int i6 = 0;
                    Object objE = nc6.e(this.G, new qka(zehVar, 0), new zy7() { // from class: rka
                        @Override // defpackage.zy7
                        public final Object a() {
                            int i7 = i6;
                            iei ieiVar2 = iei.a;
                            zeh zehVar2 = zehVar;
                            switch (i7) {
                                case 0:
                                    zehVar2.b();
                                    break;
                                default:
                                    zehVar2.onCancel();
                                    break;
                            }
                            return ieiVar2;
                        }
                    }, new zy7() { // from class: rka
                        @Override // defpackage.zy7
                        public final Object a() {
                            int i7 = i2;
                            iei ieiVar2 = iei.a;
                            zeh zehVar2 = zehVar;
                            switch (i7) {
                                case 0:
                                    zehVar2.b();
                                    break;
                                default:
                                    zehVar2.onCancel();
                                    break;
                            }
                            return ieiVar2;
                        }
                    }, new ska(0, zehVar), this);
                    if (objE != m45Var) {
                        objE = ieiVar;
                    }
                    if (objE == m45Var) {
                    }
                }
                break;
        }
        return ieiVar;
    }
}

package defpackage;

import android.content.Context;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class w1c {
    public static w1c f;
    public int a;
    public boolean b;
    public Object c;
    public Object d = new jne();
    public Object e = new hug[2];

    public w1c(pug pugVar) {
        this.c = pugVar;
    }

    public static final void a(w1c w1cVar) {
        hug[] hugVarArr = (hug[]) w1cVar.e;
        int i = w1cVar.a;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            hug hugVar = hugVarArr[i3];
            if (hugVar == null) {
                break;
            }
            if (hugVar.g != 4 || hugVar.e.f()) {
                if (i2 != i3) {
                    hugVarArr[i2] = hugVar;
                    hugVarArr[i3] = null;
                }
                i2++;
            } else {
                hugVarArr[i3] = null;
            }
        }
        w1cVar.a = i2;
        if (i == i2 || w1cVar.b) {
            return;
        }
        w1cVar.b = true;
        try {
            ((pug) w1cVar.c).v1(false);
        } finally {
            w1cVar.b = false;
        }
    }

    public static synchronized w1c c(Context context) {
        try {
            if (f == null) {
                w1c w1cVar = new w1c();
                Executor executorD = ac1.d();
                w1cVar.c = executorD;
                w1cVar.d = new CopyOnWriteArrayList();
                w1cVar.e = new Object();
                w1cVar.a = 0;
                executorD.execute(new yw5(w1cVar, 19, context));
                f = w1cVar;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f;
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x036c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(int r22, defpackage.cz5 r23, defpackage.jne r24, defpackage.pug r25) {
        /*
            Method dump skipped, instruction units count: 1092
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w1c.b(int, cz5, jne, pug):void");
    }

    public int d() {
        int i;
        synchronized (this.e) {
            i = this.a;
        }
        return i;
    }

    public boolean e() {
        return this.a > 0;
    }

    public int f(pug pugVar, cz5 cz5Var, boolean z) {
        hug[] hugVarArr = (hug[]) this.e;
        int i = this.a;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            hug hugVar = hugVarArr[i4];
            if (hugVar != null) {
                w1c w1cVar = hugVar.i;
                jne jneVar = hugVar.f;
                int i5 = hugVar.g;
                tp4 tp4Var = null;
                int i6 = 1;
                if (i5 == 3) {
                    jneVar.n(hugVar.b, pugVar, cz5Var, true);
                    i3 |= jneVar.H;
                    hqb hqbVar = pugVar.E;
                    if (z) {
                        l45 l45VarD1 = hqbVar.d1();
                        fkg fkgVar = hugVar.h;
                        if (fkgVar != null) {
                            fkgVar.d(null);
                        }
                        hugVar.h = gb9.D(l45VarD1, null, null, new fug(hugVar, tp4Var, i2), 3);
                    } else {
                        l45 l45VarD12 = hqbVar.d1();
                        fkg fkgVar2 = hugVar.h;
                        if (fkgVar2 != null) {
                            fkgVar2.d(null);
                        }
                        hugVar.h = gb9.D(l45VarD12, null, null, new fug(hugVar, tp4Var, i6), 3);
                    }
                } else if (i5 == 1) {
                    hugVar.g = 4;
                    jneVar.getClass();
                    kne.a.e(jneVar);
                    jneVar.n(hugVar.b, pugVar, cz5Var, true);
                    i3 |= jneVar.H;
                    hqb hqbVar2 = pugVar.E;
                    if (z) {
                        l45 l45VarD13 = hqbVar2.d1();
                        fkg fkgVar3 = hugVar.h;
                        if (fkgVar3 != null) {
                            fkgVar3.d(null);
                        }
                        hugVar.h = gb9.D(l45VarD13, null, null, new gug(hugVar, w1cVar, tp4Var, i2), 3);
                    } else {
                        l45 l45VarD14 = hqbVar2.d1();
                        fkg fkgVar4 = hugVar.h;
                        if (fkgVar4 != null) {
                            fkgVar4.d(null);
                        }
                        hugVar.h = gb9.D(l45VarD14, null, null, new gug(hugVar, w1cVar, tp4Var, i6), 3);
                    }
                }
            }
        }
        return i3;
    }

    public void g() {
        hug[] hugVarArr = (hug[]) this.e;
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            hug hugVar = hugVarArr[i2];
            if (hugVar != null) {
                int i3 = hugVar.g;
                if (i3 == 2 || i3 == 3) {
                    i3 = 1;
                }
                hugVar.g = i3;
            }
        }
    }

    public void h(int i, eug eugVar, yig yigVar, yig yigVar2) {
        hug hugVar;
        hug[] hugVarArr = (hug[]) this.e;
        int i2 = this.a;
        int i3 = 0;
        while (true) {
            if (i3 < i2) {
                hugVar = hugVarArr[i3];
                if (hugVar != null && hugVar.a == i) {
                    break;
                } else {
                    i3++;
                }
            } else {
                hugVar = null;
                break;
            }
        }
        if (hugVar != null) {
            hugVar.b = eugVar;
            int i4 = hugVar.g;
            if (i4 == 1) {
                hugVar.g = 2;
                return;
            } else {
                if (i4 != 4) {
                    return;
                }
                hugVar.g = 3;
                return;
            }
        }
        int i5 = this.a + 1;
        hug[] hugVarArr2 = (hug[]) this.e;
        int length = hugVarArr2.length;
        if (i5 > length) {
            this.e = (hug[]) Arrays.copyOf(hugVarArr2, Math.max(length * 2, 2));
        }
        ((hug[]) this.e)[this.a] = new hug(this, i, eugVar, yigVar, yigVar2);
        this.a++;
    }

    public void i(int i) {
        CopyOnWriteArrayList<v1c> copyOnWriteArrayList = (CopyOnWriteArrayList) this.d;
        for (v1c v1cVar : copyOnWriteArrayList) {
            if (v1cVar.a.get() == null) {
                copyOnWriteArrayList.remove(v1cVar);
            }
        }
        synchronized (this.e) {
            try {
                if (this.b && this.a == i) {
                    return;
                }
                this.b = true;
                this.a = i;
                for (v1c v1cVar2 : (CopyOnWriteArrayList) this.d) {
                    v1cVar2.b.execute(new pya(2, v1cVar2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public jne j(int i, cz5 cz5Var, jne jneVar, pug pugVar) {
        jne jneVar2 = (jne) this.d;
        jneVar.e(jneVar2);
        b(i, cz5Var, jneVar2, pugVar);
        return jneVar2;
    }
}

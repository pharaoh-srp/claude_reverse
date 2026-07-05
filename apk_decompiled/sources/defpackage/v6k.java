package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class v6k extends b88 {
    public final w6g d0;
    public final w6g e0;
    public final w6g f0;

    public v6k(rl rlVar, Context context, Looper looper, kmj kmjVar, kmj kmjVar2) {
        super(context, looper, 23, rlVar, kmjVar, kmjVar2, 0);
        this.d0 = new w6g(0);
        this.e0 = new w6g(0);
        this.f0 = new w6g(0);
    }

    @Override // defpackage.fe1
    public final boolean B() {
        return true;
    }

    public final void E(t5k t5kVar, LocationRequest locationRequest, j5h j5hVar) {
        i6k i6kVar;
        jf7 jf7Var;
        fba fbaVarZza = t5kVar.zza();
        dba dbaVarA = fbaVarZza.a();
        Objects.requireNonNull(dbaVarA);
        jf7[] jf7VarArrJ = j();
        boolean z = false;
        if (jf7VarArrJ != null) {
            int i = 0;
            while (true) {
                if (i >= jf7VarArrJ.length) {
                    jf7Var = null;
                    break;
                }
                jf7Var = jf7VarArrJ[i];
                if ("location_updates_with_callback".equals(jf7Var.E)) {
                    break;
                } else {
                    i++;
                }
            }
            if (jf7Var != null && jf7Var.l0() >= 1) {
                z = true;
            }
        }
        synchronized (this.e0) {
            try {
                i6k i6kVar2 = (i6k) this.e0.get(dbaVarA);
                if (i6kVar2 == null || z) {
                    i6k i6kVar3 = new i6k(t5kVar);
                    this.e0.put(dbaVarA, i6kVar3);
                    i6kVar = i6kVar3;
                } else {
                    i6kVar2.H(fbaVarZza);
                    i6kVar = i6kVar2;
                    i6kVar2 = null;
                }
                if (z) {
                    ((c5l) t()).P(b8k.l0(i6kVar2, i6kVar, dbaVarA.a()), locationRequest, new t4k(null, j5hVar));
                } else {
                    ((c5l) t()).O(new q8k(1, i8k.l0(locationRequest), null, i6kVar, null, new b4k(j5hVar, i6kVar), dbaVarA.a()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007b A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:4:0x0003, B:6:0x000e, B:7:0x0013, B:11:0x0019, B:13:0x001e, B:16:0x0025, B:18:0x0029, B:25:0x003d, B:27:0x0047, B:30:0x0099, B:21:0x0036, B:28:0x007b, B:29:0x0094), top: B:34:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(defpackage.dba r11, boolean r12, defpackage.j5h r13) {
        /*
            r10 = this;
            w6g r1 = r10.e0
            monitor-enter(r1)
            w6g r0 = r10.e0     // Catch: java.lang.Throwable -> L15
            java.lang.Object r11 = r0.remove(r11)     // Catch: java.lang.Throwable -> L15
            r6 = r11
            i6k r6 = (defpackage.i6k) r6     // Catch: java.lang.Throwable -> L15
            if (r6 != 0) goto L19
            java.lang.Boolean r10 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L15
            r13.b(r10)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r0 = move-exception
            r10 = r0
            goto L9b
        L19:
            r6.J()     // Catch: java.lang.Throwable -> L15
            if (r12 == 0) goto L94
            jf7[] r11 = r10.j()     // Catch: java.lang.Throwable -> L15
            if (r11 == 0) goto L7b
            r12 = 0
        L25:
            int r0 = r11.length     // Catch: java.lang.Throwable -> L15
            r2 = 0
            if (r12 >= r0) goto L39
            r0 = r11[r12]     // Catch: java.lang.Throwable -> L15
            java.lang.String r3 = "location_updates_with_callback"
            java.lang.String r4 = r0.E     // Catch: java.lang.Throwable -> L15
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L15
            if (r3 == 0) goto L36
            goto L3a
        L36:
            int r12 = r12 + 1
            goto L25
        L39:
            r0 = r2
        L3a:
            if (r0 != 0) goto L3d
            goto L7b
        L3d:
            long r11 = r0.l0()     // Catch: java.lang.Throwable -> L15
            r3 = 1
            int r11 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r11 < 0) goto L7b
            android.os.IInterface r10 = r10.t()     // Catch: java.lang.Throwable -> L15
            c5l r10 = (defpackage.c5l) r10     // Catch: java.lang.Throwable -> L15
            java.lang.String r11 = "ILocationCallback@"
            int r12 = java.lang.System.identityHashCode(r6)     // Catch: java.lang.Throwable -> L15
            java.lang.String r0 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L15
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L15
            int r0 = r0 + 18
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L15
            r3.append(r11)     // Catch: java.lang.Throwable -> L15
            r3.append(r12)     // Catch: java.lang.Throwable -> L15
            java.lang.String r11 = r3.toString()     // Catch: java.lang.Throwable -> L15
            b8k r11 = defpackage.b8k.l0(r2, r6, r11)     // Catch: java.lang.Throwable -> L15
            java.lang.Boolean r12 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L15
            t4k r0 = new t4k     // Catch: java.lang.Throwable -> L15
            r0.<init>(r12, r13)     // Catch: java.lang.Throwable -> L15
            r10.Q(r11, r0)     // Catch: java.lang.Throwable -> L15
            goto L99
        L7b:
            android.os.IInterface r10 = r10.t()     // Catch: java.lang.Throwable -> L15
            c5l r10 = (defpackage.c5l) r10     // Catch: java.lang.Throwable -> L15
            d5k r8 = new d5k     // Catch: java.lang.Throwable -> L15
            r8.<init>(r13)     // Catch: java.lang.Throwable -> L15
            q8k r2 = new q8k     // Catch: java.lang.Throwable -> L15
            r7 = 0
            r9 = 0
            r3 = 2
            r4 = 0
            r5 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L15
            r10.O(r2)     // Catch: java.lang.Throwable -> L15
            goto L99
        L94:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L15
            r13.b(r10)     // Catch: java.lang.Throwable -> L15
        L99:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            return
        L9b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v6k.F(dba, boolean, j5h):void");
    }

    @Override // defpackage.fe1, defpackage.ge0
    public final int i() {
        return 11717000;
    }

    @Override // defpackage.fe1
    public final /* synthetic */ IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof c5l ? (c5l) iInterfaceQueryLocalInterface : new c5l(iBinder);
    }

    @Override // defpackage.fe1
    public final jf7[] q() {
        return xik.c;
    }

    @Override // defpackage.fe1
    public final String u() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // defpackage.fe1
    public final String v() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // defpackage.fe1
    public final void y() {
        System.currentTimeMillis();
        synchronized (this.d0) {
            this.d0.clear();
        }
        synchronized (this.e0) {
            this.e0.clear();
        }
        synchronized (this.f0) {
            this.f0.clear();
        }
    }
}

package defpackage;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class btk implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ AtomicReference F;
    public final /* synthetic */ jsk G;

    public /* synthetic */ btk(jsk jskVar, AtomicReference atomicReference, int i) {
        this.E = i;
        this.G = jskVar;
        this.F = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.E) {
            case 0:
                jsk jskVar = this.G;
                AtomicReference atomicReference = this.F;
                Bundle bundleW = jskVar.I0().S.W();
                hyk hykVarN = ((umk) jskVar.E).n();
                if (bundleW == null) {
                    bundleW = new Bundle();
                }
                hykVarN.K0();
                hykVarN.O0();
                hykVarN.R0(new me2(hykVarN, atomicReference, hykVarN.d1(false), bundleW, 5));
                return;
            case 1:
                synchronized (this.F) {
                    try {
                        try {
                            AtomicReference atomicReference2 = this.F;
                            umk umkVar = (umk) this.G.E;
                            vqj vqjVar = umkVar.K;
                            String strR0 = umkVar.j().R0();
                            vqjVar.getClass();
                            atomicReference2.set(Boolean.valueOf(vqjVar.X0(strR0, zvj.M)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 2:
                synchronized (this.F) {
                    try {
                        try {
                            AtomicReference atomicReference3 = this.F;
                            umk umkVar2 = (umk) this.G.E;
                            vqj vqjVar2 = umkVar2.K;
                            String strR02 = umkVar2.j().R0();
                            vqjVar2.getClass();
                            atomicReference3.set(vqjVar2.U0(strR02, zvj.N));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 3:
                synchronized (this.F) {
                    try {
                        try {
                            AtomicReference atomicReference4 = this.F;
                            umk umkVar3 = (umk) this.G.E;
                            atomicReference4.set(Integer.valueOf(umkVar3.K.R0(umkVar3.j().R0(), zvj.P)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            default:
                synchronized (this.F) {
                    try {
                        try {
                            AtomicReference atomicReference5 = this.F;
                            umk umkVar4 = (umk) this.G.E;
                            atomicReference5.set(Double.valueOf(umkVar4.K.L0(umkVar4.j().R0(), zvj.Q)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
        }
    }
}

package defpackage;

import java.io.Closeable;
import okio.Buffer;
import okio.RealBufferedSource;
import okio.Socket;

/* JADX INFO: loaded from: classes.dex */
public final class pqe implements Closeable {
    public final kie E;
    public final bvd F;
    public final String G;
    public final int H;
    public final cf8 I;
    public final wg8 J;
    public final rqe K;
    public final Socket L;
    public final pqe M;
    public final pqe N;
    public final pqe O;
    public final long P;
    public final long Q;
    public final w47 R;
    public final t4i S;
    public y42 T;
    public final boolean U;
    public final boolean V;

    public pqe(kie kieVar, bvd bvdVar, String str, int i, cf8 cf8Var, wg8 wg8Var, rqe rqeVar, Socket socket, pqe pqeVar, pqe pqeVar2, pqe pqeVar3, long j, long j2, w47 w47Var, t4i t4iVar) {
        kieVar.getClass();
        bvdVar.getClass();
        str.getClass();
        rqeVar.getClass();
        t4iVar.getClass();
        this.E = kieVar;
        this.F = bvdVar;
        this.G = str;
        this.H = i;
        this.I = cf8Var;
        this.J = wg8Var;
        this.K = rqeVar;
        this.L = socket;
        this.M = pqeVar;
        this.N = pqeVar2;
        this.O = pqeVar3;
        this.P = j;
        this.Q = j2;
        this.R = w47Var;
        this.S = t4iVar;
        boolean z = true;
        this.U = 200 <= i && i < 300;
        if (i != 307 && i != 308) {
            switch (i) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    z = false;
                    break;
            }
        }
        this.V = z;
    }

    public final nqe c() {
        nqe nqeVar = new nqe();
        nqeVar.c = -1;
        nqeVar.g = rqe.E;
        nqeVar.o = t4i.t;
        nqeVar.a = this.E;
        nqeVar.b = this.F;
        nqeVar.c = this.H;
        nqeVar.d = this.G;
        nqeVar.e = this.I;
        nqeVar.f = this.J.g();
        nqeVar.g = this.K;
        nqeVar.h = this.L;
        nqeVar.i = this.M;
        nqeVar.j = this.N;
        nqeVar.k = this.O;
        nqeVar.l = this.P;
        nqeVar.m = this.Q;
        nqeVar.n = this.R;
        nqeVar.o = this.S;
        return nqeVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.K.close();
    }

    public final qqe d(long j) {
        rqe rqeVar = this.K;
        RealBufferedSource realBufferedSourcePeek = rqeVar.G0().peek();
        Buffer buffer = new Buffer();
        realBufferedSourcePeek.j0(j);
        buffer.x0(realBufferedSourcePeek, Math.min(j, realBufferedSourcePeek.F.F));
        qqe qqeVar = rqe.E;
        return new qqe(rqeVar.e(), buffer.F, buffer);
    }

    public final String toString() {
        return "Response{protocol=" + this.F + ", code=" + this.H + ", message=" + this.G + ", url=" + this.E.a + '}';
    }
}

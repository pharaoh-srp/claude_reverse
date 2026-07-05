package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.InflaterSource;
import okio.RealBufferedSource;

/* JADX INFO: loaded from: classes3.dex */
public final class c7j implements Closeable {
    public final BufferedSource E;
    public final b7j F;
    public final boolean G;
    public final boolean H;
    public boolean I;
    public boolean J;
    public int K;
    public long L;
    public boolean M;
    public boolean N;
    public boolean O;
    public final Buffer P;
    public final Buffer Q;
    public khb R;
    public final byte[] S;

    public c7j(BufferedSource bufferedSource, b7j b7jVar, boolean z, boolean z2) {
        bufferedSource.getClass();
        this.E = bufferedSource;
        this.F = b7jVar;
        this.G = z;
        this.H = z2;
        this.P = new Buffer();
        this.Q = new Buffer();
        this.S = null;
    }

    public final void c() throws IOException {
        if (this.I) {
            sz6.j("closed");
            return;
        }
        e();
        if (this.N) {
            d();
            return;
        }
        int i = this.K;
        if (i != 1 && i != 2) {
            TimeZone timeZone = blj.a;
            String hexString = Integer.toHexString(i);
            hexString.getClass();
            throw new ProtocolException("Unknown opcode: ".concat(hexString));
        }
        while (!this.J) {
            long j = this.L;
            Buffer buffer = this.Q;
            if (j > 0) {
                this.E.J(buffer, j);
            }
            if (this.M) {
                if (this.O) {
                    khb khbVar = this.R;
                    if (khbVar == null) {
                        khbVar = new khb(this.H);
                        this.R = khbVar;
                    }
                    Buffer buffer2 = khbVar.F;
                    if (buffer2.F != 0) {
                        sz6.p("Failed requirement.");
                        return;
                    }
                    Inflater inflater = khbVar.G;
                    if (inflater == null) {
                        inflater = new Inflater(true);
                        khbVar.G = inflater;
                    }
                    InflaterSource inflaterSource = khbVar.H;
                    if (inflaterSource == null) {
                        inflaterSource = new InflaterSource(new RealBufferedSource(buffer2), inflater);
                        khbVar.H = inflaterSource;
                    }
                    if (khbVar.E) {
                        inflater.reset();
                    }
                    buffer2.f0(buffer);
                    buffer2.P0(65535);
                    long bytesRead = inflater.getBytesRead() + buffer2.F;
                    do {
                        inflaterSource.c(buffer, Long.MAX_VALUE);
                        if (inflater.getBytesRead() >= bytesRead) {
                            break;
                        }
                    } while (!inflater.finished());
                    if (inflater.getBytesRead() < bytesRead) {
                        buffer2.c();
                        inflaterSource.close();
                        khbVar.H = null;
                        khbVar.G = null;
                    }
                }
                b7j b7jVar = this.F;
                if (i == 1) {
                    p5e p5eVar = (p5e) b7jVar;
                    p5eVar.b.m(p5eVar, buffer.t0());
                    return;
                } else {
                    ByteString byteStringT = buffer.t(buffer.F);
                    p5e p5eVar2 = (p5e) b7jVar;
                    byteStringT.getClass();
                    p5eVar2.b.n(p5eVar2, byteStringT);
                    return;
                }
            }
            while (!this.J) {
                e();
                if (!this.N) {
                    break;
                } else {
                    d();
                }
            }
            if (this.K != 0) {
                int i2 = this.K;
                TimeZone timeZone2 = blj.a;
                String hexString2 = Integer.toHexString(i2);
                hexString2.getClass();
                throw new ProtocolException("Expected continuation opcode. Got: ".concat(hexString2));
            }
        }
        xh6.c("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.I) {
            return;
        }
        this.I = true;
        khb khbVar = this.R;
        if (khbVar != null) {
            zkj.b(khbVar);
        }
        zkj.b(this.E);
    }

    public final void d() throws ProtocolException, EOFException {
        String strT0;
        short s;
        long j = this.L;
        if (j > 0) {
            this.E.J(this.P, j);
        }
        switch (this.K) {
            case 8:
                Buffer buffer = this.P;
                long j2 = buffer.F;
                if (j2 == 1) {
                    mr9.s("Malformed close payload length of 1.");
                    return;
                }
                if (j2 != 0) {
                    s = buffer.readShort();
                    strT0 = this.P.t0();
                    String strP = (s < 1000 || s >= 5000) ? grc.p(s, "Code must be in range [1000,5000): ") : ((1004 > s || s >= 1007) && (1015 > s || s >= 3000)) ? null : grc.u("Code ", s, " is reserved and may not be used.");
                    if (strP != null) {
                        mr9.s(strP);
                        return;
                    }
                } else {
                    strT0 = "";
                    s = 1005;
                }
                p5e p5eVar = (p5e) this.F;
                if (s == -1) {
                    sz6.p("Failed requirement.");
                    return;
                }
                synchronized (p5eVar) {
                    if (p5eVar.t != -1) {
                        throw new IllegalStateException("already closed");
                    }
                    p5eVar.t = s;
                    p5eVar.u = strT0;
                }
                p5eVar.b.k(p5eVar, s, strT0);
                this.J = true;
                return;
            case 9:
                b7j b7jVar = this.F;
                Buffer buffer2 = this.P;
                ByteString byteStringT = buffer2.t(buffer2.F);
                p5e p5eVar2 = (p5e) b7jVar;
                synchronized (p5eVar2) {
                    try {
                        byteStringT.getClass();
                        if (!p5eVar2.v && (!p5eVar2.s || !p5eVar2.q.isEmpty())) {
                            p5eVar2.p.add(byteStringT);
                            p5eVar2.g();
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 10:
                b7j b7jVar2 = this.F;
                Buffer buffer3 = this.P;
                ByteString byteStringT2 = buffer3.t(buffer3.F);
                p5e p5eVar3 = (p5e) b7jVar2;
                synchronized (p5eVar3) {
                    byteStringT2.getClass();
                    p5eVar3.x = false;
                }
                return;
            default:
                int i = this.K;
                TimeZone timeZone = blj.a;
                String hexString = Integer.toHexString(i);
                hexString.getClass();
                throw new ProtocolException("Unknown control opcode: ".concat(hexString));
        }
    }

    public final void e() throws IOException {
        boolean z;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (this.J) {
            xh6.c("closed");
            return;
        }
        BufferedSource bufferedSource = this.E;
        long c = bufferedSource.getF().getC();
        bufferedSource.getF().d();
        try {
            byte b = bufferedSource.readByte();
            byte[] bArr = zkj.a;
            bufferedSource.getF().i(c, timeUnit);
            int i = b & 15;
            this.K = i;
            boolean z2 = (b & 128) != 0;
            this.M = z2;
            boolean z3 = (b & 8) != 0;
            this.N = z3;
            if (z3 && !z2) {
                mr9.s("Control frames must be final.");
                return;
            }
            boolean z4 = (b & 64) != 0;
            if (i == 1 || i == 2) {
                if (!z4) {
                    z = false;
                } else {
                    if (!this.G) {
                        mr9.s("Unexpected rsv1 flag");
                        return;
                    }
                    z = true;
                }
                this.O = z;
            } else if (z4) {
                mr9.s("Unexpected rsv1 flag");
                return;
            }
            if ((b & 32) != 0) {
                mr9.s("Unexpected rsv2 flag");
                return;
            }
            if ((b & 16) != 0) {
                mr9.s("Unexpected rsv3 flag");
                return;
            }
            byte b2 = bufferedSource.readByte();
            boolean z5 = (b2 & 128) != 0;
            if (z5) {
                mr9.s("Server-sent frames must not be masked.");
                return;
            }
            long j = b2 & 127;
            this.L = j;
            if (j == 126) {
                this.L = bufferedSource.readShort() & 65535;
            } else if (j == 127) {
                long j2 = bufferedSource.readLong();
                this.L = j2;
                if (j2 < 0) {
                    long j3 = this.L;
                    TimeZone timeZone = blj.a;
                    String hexString = Long.toHexString(j3);
                    hexString.getClass();
                    throw new ProtocolException("Frame length 0x" + hexString + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.N && this.L > 125) {
                mr9.s("Control frame must be less than 125B.");
            } else if (z5) {
                byte[] bArr2 = this.S;
                bArr2.getClass();
                bufferedSource.readFully(bArr2);
            }
        } catch (Throwable th) {
            bufferedSource.getF().i(c, timeUnit);
            throw th;
        }
    }
}

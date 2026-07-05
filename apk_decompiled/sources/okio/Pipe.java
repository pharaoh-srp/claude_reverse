package okio;

import defpackage.mdj;
import defpackage.mr9;
import defpackage.vb7;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import okio.Timeout;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/Pipe;", "", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class Pipe {
    public final long a;
    public final Buffer b = new Buffer();
    public boolean c;
    public boolean d;
    public BufferedSink e;
    public final ReentrantLock f;
    public final Condition g;
    public final Pipe$sink$1 h;

    /* JADX WARN: Type inference failed for: r3v1, types: [okio.Pipe$sink$1] */
    public Pipe(long j) {
        this.a = j;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        conditionNewCondition.getClass();
        this.g = conditionNewCondition;
        if (j < 1) {
            mr9.q(vb7.m(j, "maxBufferSize < 1: "));
            throw null;
        }
        this.h = new Sink() { // from class: okio.Pipe$sink$1
            public final Timeout E = new Timeout();

            /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
            
                if (r2 == null) goto L52;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
            
                r11 = r2.getE();
                r0 = r0.h.E;
                r3 = r11.getC();
                r5 = okio.Timeout.Companion.a(r0.c, r11.getC());
                r1 = java.util.concurrent.TimeUnit.NANOSECONDS;
                r11.i(r5, r1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
            
                if (r11.getA() == false) goto L39;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
            
                r5 = r11.e();
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
            
                if (r0.a == false) goto L58;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
            
                r11.f(java.lang.Math.min(r11.e(), r0.e()));
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x0085, code lost:
            
                r2.c0(r12, r13);
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x0092, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x0093, code lost:
            
                r12 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x0094, code lost:
            
                r11.i(r3, r1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x0099, code lost:
            
                if (r0.a != false) goto L37;
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x009b, code lost:
            
                r11.f(r5);
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x009e, code lost:
            
                throw r12;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x00a1, code lost:
            
                if (r0.a == false) goto L60;
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x00a3, code lost:
            
                r11.f(r0.e());
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x00aa, code lost:
            
                r2.c0(r12, r13);
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x00b7, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x00b8, code lost:
            
                r12 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x00b9, code lost:
            
                r11.i(r3, r1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x00be, code lost:
            
                if (r0.a != false) goto L50;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x00c0, code lost:
            
                r11.c();
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x00c3, code lost:
            
                throw r12;
             */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x00c4, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:71:?, code lost:
            
                return;
             */
            @Override // okio.Sink
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void c0(okio.Buffer r12, long r13) {
                /*
                    Method dump skipped, instruction units count: 209
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: okio.Pipe$sink$1.c0(okio.Buffer, long):void");
            }

            @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                boolean z;
                Pipe pipe = this.F;
                ReentrantLock reentrantLock2 = pipe.f;
                reentrantLock2.lock();
                try {
                    if (pipe.c) {
                        reentrantLock2.unlock();
                        return;
                    }
                    BufferedSink bufferedSink = pipe.e;
                    if (bufferedSink == null) {
                        if (pipe.d && pipe.b.F > 0) {
                            throw new IOException("source is closed");
                        }
                        pipe.c = true;
                        pipe.g.signalAll();
                        bufferedSink = null;
                    }
                    if (bufferedSink != null) {
                        Timeout e = bufferedSink.getE();
                        Timeout timeout = pipe.h.E;
                        long c = e.getC();
                        long jA = Timeout.Companion.a(timeout.c, e.getC());
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        e.i(jA, timeUnit);
                        if (!e.getA()) {
                            if (timeout.a) {
                                e.f(timeout.e());
                            }
                            try {
                                bufferedSink.close();
                                if (z) {
                                    return;
                                } else {
                                    return;
                                }
                            } finally {
                                e.i(c, timeUnit);
                                if (timeout.a) {
                                    e.c();
                                }
                            }
                        }
                        long jE = e.e();
                        if (timeout.a) {
                            e.f(Math.min(e.e(), timeout.e()));
                        }
                        try {
                            bufferedSink.close();
                        } finally {
                            e.i(c, timeUnit);
                            if (timeout.a) {
                                e.f(jE);
                            }
                        }
                    }
                } finally {
                    reentrantLock2.unlock();
                }
            }

            @Override // okio.Sink, java.io.Flushable
            public final void flush() {
                boolean z;
                Pipe pipe = this.F;
                ReentrantLock reentrantLock2 = pipe.f;
                reentrantLock2.lock();
                try {
                    if (pipe.c) {
                        throw new IllegalStateException("closed");
                    }
                    BufferedSink bufferedSink = pipe.e;
                    if (bufferedSink == null) {
                        if (pipe.d && pipe.b.F > 0) {
                            throw new IOException("source is closed");
                        }
                        bufferedSink = null;
                    }
                    if (bufferedSink != null) {
                        Timeout e = bufferedSink.getE();
                        Timeout timeout = pipe.h.E;
                        long c = e.getC();
                        long jA = Timeout.Companion.a(timeout.c, e.getC());
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        e.i(jA, timeUnit);
                        if (!e.getA()) {
                            if (timeout.a) {
                                e.f(timeout.e());
                            }
                            try {
                                bufferedSink.flush();
                                if (z) {
                                    return;
                                } else {
                                    return;
                                }
                            } finally {
                                e.i(c, timeUnit);
                                if (timeout.a) {
                                    e.c();
                                }
                            }
                        }
                        long jE = e.e();
                        if (timeout.a) {
                            e.f(Math.min(e.e(), timeout.e()));
                        }
                        try {
                            bufferedSink.flush();
                        } finally {
                            e.i(c, timeUnit);
                            if (timeout.a) {
                                e.f(jE);
                            }
                        }
                    }
                } finally {
                    reentrantLock2.unlock();
                }
            }

            @Override // okio.Sink
            /* JADX INFO: renamed from: l, reason: from getter */
            public final Timeout getE() {
                return this.E;
            }
        };
        new Source() { // from class: okio.Pipe$source$1
            public final Timeout E = new Timeout();

            @Override // okio.Source
            public final long A0(Buffer buffer, long j2) {
                buffer.getClass();
                Pipe pipe = this.F;
                ReentrantLock reentrantLock2 = pipe.f;
                reentrantLock2.lock();
                try {
                    boolean z = pipe.d;
                    Condition condition = pipe.g;
                    if (z) {
                        throw new IllegalStateException("closed");
                    }
                    while (true) {
                        Buffer buffer2 = pipe.b;
                        if (buffer2.F != 0) {
                            long jA0 = buffer2.A0(buffer, j2);
                            condition.signalAll();
                            reentrantLock2.unlock();
                            return jA0;
                        }
                        if (pipe.c) {
                            reentrantLock2.unlock();
                            return -1L;
                        }
                        this.E.a(condition);
                    }
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                Pipe pipe = this.F;
                ReentrantLock reentrantLock2 = pipe.f;
                reentrantLock2.lock();
                try {
                    pipe.d = true;
                    pipe.g.signalAll();
                } finally {
                    reentrantLock2.unlock();
                }
            }

            @Override // okio.Source
            /* JADX INFO: renamed from: l, reason: from getter */
            public final Timeout getE() {
                return this.E;
            }
        };
    }
}

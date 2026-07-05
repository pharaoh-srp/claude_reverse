package com.squareup.wire.internal;

import defpackage.mdj;
import defpackage.p8b;
import defpackage.tie;
import kotlin.Metadata;
import okio.BufferedSink;
import okio.Okio;
import okio.Pipe;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/squareup/wire/internal/PipeDuplexRequestBody;", "Ltie;", "Lp8b;", "contentType", "", "pipeMaxBufferSize", "<init>", "(Lp8b;J)V", "Lokio/BufferedSink;", "createSink", "()Lokio/BufferedSink;", "()Lp8b;", "sink", "Liei;", "writeTo", "(Lokio/BufferedSink;)V", "", "isDuplex", "()Z", "isOneShot", "Lp8b;", "Lokio/Pipe;", "pipe", "Lokio/Pipe;", "wire-grpc-client"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
public final class PipeDuplexRequestBody extends tie {
    private final p8b contentType;
    private final Pipe pipe;

    public PipeDuplexRequestBody(p8b p8bVar, long j) {
        this.contentType = p8bVar;
        this.pipe = new Pipe(j);
    }

    @Override // defpackage.tie
    /* JADX INFO: renamed from: contentType, reason: from getter */
    public p8b getContentType() {
        return this.contentType;
    }

    public final BufferedSink createSink() {
        return Okio.b(this.pipe.h);
    }

    @Override // defpackage.tie
    public boolean isDuplex() {
        return true;
    }

    @Override // defpackage.tie
    public boolean isOneShot() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        defpackage.x44.o0("sinkBuffer");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0069, code lost:
    
        throw new java.lang.IllegalStateException("sink already folded");
     */
    @Override // defpackage.tie
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void writeTo(okio.BufferedSink r10) {
        /*
            r9 = this;
            r10.getClass()
            okio.Pipe r9 = r9.pipe
            java.util.concurrent.locks.Condition r0 = r9.g
            okio.Buffer r1 = r9.b
            java.util.concurrent.locks.ReentrantLock r2 = r9.f
        Lb:
            r2.lock()
            okio.BufferedSink r3 = r9.e     // Catch: java.lang.Throwable -> L23
            if (r3 != 0) goto L62
            boolean r3 = r9.c     // Catch: java.lang.Throwable -> L23
            boolean r4 = r1.F()     // Catch: java.lang.Throwable -> L23
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L25
            r9.d = r6     // Catch: java.lang.Throwable -> L23
            r9.e = r10     // Catch: java.lang.Throwable -> L23
            r4 = r5
            r7 = r6
            goto L33
        L23:
            r9 = move-exception
            goto L6a
        L25:
            okio.Buffer r4 = new okio.Buffer     // Catch: java.lang.Throwable -> L23
            r4.<init>()     // Catch: java.lang.Throwable -> L23
            long r7 = r1.F     // Catch: java.lang.Throwable -> L23
            r4.c0(r1, r7)     // Catch: java.lang.Throwable -> L23
            r0.signalAll()     // Catch: java.lang.Throwable -> L23
            r7 = 0
        L33:
            r2.unlock()
            if (r7 == 0) goto L3e
            if (r3 == 0) goto L3d
            r10.close()
        L3d:
            return
        L3e:
            if (r4 == 0) goto L4b
            long r7 = r4.F     // Catch: java.lang.Throwable -> L49
            r10.c0(r4, r7)     // Catch: java.lang.Throwable -> L49
            r10.flush()     // Catch: java.lang.Throwable -> L49
            goto Lb
        L49:
            r10 = move-exception
            goto L51
        L4b:
            java.lang.String r10 = "sinkBuffer"
            defpackage.x44.o0(r10)     // Catch: java.lang.Throwable -> L49
            throw r5     // Catch: java.lang.Throwable -> L49
        L51:
            r2.lock()
            r9.d = r6     // Catch: java.lang.Throwable -> L5d
            r0.signalAll()     // Catch: java.lang.Throwable -> L5d
            r2.unlock()
            throw r10
        L5d:
            r9 = move-exception
            r2.unlock()
            throw r9
        L62:
            java.lang.String r9 = "sink already folded"
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L23
            r10.<init>(r9)     // Catch: java.lang.Throwable -> L23
            throw r10     // Catch: java.lang.Throwable -> L23
        L6a:
            r2.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.wire.internal.PipeDuplexRequestBody.writeTo(okio.BufferedSink):void");
    }
}

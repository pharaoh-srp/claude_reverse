package okio;

import defpackage.mdj;
import defpackage.sz6;
import defpackage.x44;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/PriorityQueue;", "", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class PriorityQueue {
    public int a;
    public AsyncTimeout[] b;

    public final void a(int i, AsyncTimeout asyncTimeout) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            AsyncTimeout asyncTimeout2 = this.b[i2];
            asyncTimeout2.getClass();
            if (x44.A(0L, asyncTimeout.h - asyncTimeout2.h) <= 0) {
                break;
            }
            asyncTimeout2.g = i;
            this.b[i] = asyncTimeout2;
            i = i2;
        }
        this.b[i] = asyncTimeout;
        asyncTimeout.g = i;
    }

    public final void b(AsyncTimeout asyncTimeout) {
        AsyncTimeout asyncTimeout2;
        int i = asyncTimeout.g;
        if (i == -1) {
            sz6.p("Failed requirement.");
            return;
        }
        int i2 = this.a;
        AsyncTimeout asyncTimeout3 = this.b[i2];
        asyncTimeout3.getClass();
        asyncTimeout.g = -1;
        this.b[i2] = null;
        this.a = i2 - 1;
        if (asyncTimeout == asyncTimeout3) {
            return;
        }
        int iA = x44.A(0L, asyncTimeout3.h - asyncTimeout.h);
        if (iA == 0) {
            this.b[i] = asyncTimeout3;
            asyncTimeout3.g = i;
            return;
        }
        if (iA >= 0) {
            a(i, asyncTimeout3);
            return;
        }
        while (true) {
            int i3 = i << 1;
            int i4 = i3 + 1;
            int i5 = this.a;
            if (i4 > i5) {
                if (i3 > i5) {
                    break;
                }
                asyncTimeout2 = this.b[i3];
                asyncTimeout2.getClass();
            } else {
                asyncTimeout2 = this.b[i3];
                asyncTimeout2.getClass();
                AsyncTimeout asyncTimeout4 = this.b[i4];
                asyncTimeout4.getClass();
                if (x44.A(0L, asyncTimeout4.h - asyncTimeout2.h) >= 0) {
                    asyncTimeout2 = asyncTimeout4;
                }
            }
            if (x44.A(0L, asyncTimeout2.h - asyncTimeout3.h) <= 0) {
                break;
            }
            int i6 = asyncTimeout2.g;
            asyncTimeout2.g = i;
            this.b[i] = asyncTimeout2;
            i = i6;
        }
        this.b[i] = asyncTimeout3;
        asyncTimeout3.g = i;
    }
}

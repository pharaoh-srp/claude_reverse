package defpackage;

import com.anthropic.claude.conway.f;
import java.io.IOException;
import java.net.SocketTimeoutException;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nx4 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ long F;
    public final /* synthetic */ Object G;

    public /* synthetic */ nx4(Object obj, long j, int i) {
        this.E = i;
        this.G = obj;
        this.F = j;
    }

    @Override // defpackage.zy7
    public final Object a() {
        e7j e7jVar;
        switch (this.E) {
            case 0:
                f fVar = (f) this.G;
                long j = this.F;
                fVar.I0(true);
                fVar.R.f(Long.valueOf(j));
                return iei.a;
            case 1:
                ((bz7) this.G).invoke(Long.valueOf(this.F));
                return iei.a;
            case 2:
                p5e p5eVar = (p5e) this.G;
                long j2 = this.F;
                synchronized (p5eVar) {
                    try {
                        if (!p5eVar.v && (e7jVar = p5eVar.l) != null) {
                            int i = p5eVar.x ? p5eVar.w : -1;
                            p5eVar.w++;
                            p5eVar.x = true;
                            if (i != -1) {
                                StringBuilder sb = new StringBuilder("sent ping but didn't receive pong within ");
                                sb.append(p5eVar.d);
                                sb.append("ms (after ");
                                p5e.e(p5eVar, new SocketTimeoutException(vb7.l(i - 1, " successful ping/pongs)", sb)), null, 2);
                            } else {
                                try {
                                    ByteString byteString = ByteString.H;
                                    byteString.getClass();
                                    e7jVar.c(9, byteString);
                                } catch (IOException e) {
                                    p5e.e(p5eVar, e, null, 2);
                                }
                            }
                            break;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return Long.valueOf(j2);
            default:
                return new yih((String) this.G, this.F);
        }
    }
}

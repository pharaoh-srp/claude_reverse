package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import io.sentry.t5;
import io.sentry.x2;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class m11 implements c6b, zr9, see, t5k {
    public boolean E;
    public Object F;
    public Object G;

    public m11(String str, String str2, boolean z) {
        this.G = str;
        this.F = str2;
        this.E = z;
    }

    public static m11 c(char c) {
        return new m11(new xzd(11, new li2(c)), false, (ki2) ni2.F);
    }

    @Override // defpackage.c6b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public n11 j(h2f h2fVar) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        f6b p11Var;
        int i;
        n11 n11Var;
        String str = ((g6b) h2fVar.b).a;
        n11 n11Var2 = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                if (!this.E || Build.VERSION.SDK_INT < 36) {
                    p11Var = new p11(mediaCodecCreateByCodecName, (HandlerThread) ((l11) this.G).get());
                    i = 0;
                } else {
                    p11Var = new xzd(12, mediaCodecCreateByCodecName);
                    i = 4;
                }
                n11Var = new n11(mediaCodecCreateByCodecName, (HandlerThread) ((l11) this.F).get(), p11Var, (xv8) h2fVar.g);
            } catch (Exception e) {
                e = e;
            }
            try {
                Trace.endSection();
                Surface surface = (Surface) h2fVar.e;
                if (surface == null && ((g6b) h2fVar.b).h && Build.VERSION.SDK_INT >= 35) {
                    i |= 8;
                }
                n11.j(n11Var, (MediaFormat) h2fVar.c, surface, (MediaCrypto) h2fVar.f, i);
                return n11Var;
            } catch (Exception e2) {
                e = e2;
                n11Var2 = n11Var;
                if (n11Var2 != null) {
                    n11Var2.a();
                } else if (mediaCodecCreateByCodecName != null) {
                    mediaCodecCreateByCodecName.release();
                }
                throw e;
            }
        } catch (Exception e3) {
            e = e3;
            mediaCodecCreateByCodecName = null;
        }
    }

    @Override // defpackage.see
    public void accept(Object obj, Object obj2) {
        dba dbaVar;
        boolean z;
        v6k v6kVar = (v6k) obj;
        j5h j5hVar = (j5h) obj2;
        synchronized (this) {
            dbaVar = ((fba) this.F).c;
            z = this.E;
            fba fbaVar = (fba) this.F;
            fbaVar.b = null;
            fbaVar.c = null;
        }
        if (dbaVar == null) {
            j5hVar.b(Boolean.FALSE);
        } else {
            v6kVar.F(dbaVar, z, j5hVar);
        }
    }

    public Properties b() {
        x2 x2Var = (x2) this.G;
        String str = (String) this.F;
        try {
            File file = new File(str.trim());
            if (file.isFile() && file.canRead()) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    Properties properties = new Properties();
                    properties.load(bufferedInputStream);
                    bufferedInputStream.close();
                    return properties;
                } finally {
                }
            }
            if (file.isFile()) {
                if (!file.canRead()) {
                    x2Var.h(t5.ERROR, "Failed to load Sentry configuration since it is not readable: %s", str);
                }
            } else if (this.E) {
                x2Var.h(t5.ERROR, "Failed to load Sentry configuration since it is not a file or does not exist: %s", str);
                return null;
            }
            return null;
        } catch (Throwable th) {
            x2Var.b(t5.ERROR, th, "Failed to load Sentry configuration from file: %s", str);
            return null;
        }
    }

    public nre d(List list, Set set, boolean z) {
        list.getClass();
        set.getClass();
        if (z != this.E || ((List) this.F).size() > list.size()) {
            return nre.c;
        }
        int size = ((List) this.F).size();
        for (int i = 0; i < size; i++) {
            if (((List) this.F).get(i) != list.get(i) || set.contains(Integer.valueOf(i))) {
                return nre.c;
            }
        }
        return new nre(((List) this.F).size(), (List) this.G);
    }

    @Override // defpackage.t5k
    public synchronized void e(fba fbaVar) {
        fba fbaVar2 = (fba) this.F;
        if (fbaVar2 != fbaVar) {
            fbaVar2.b = null;
            fbaVar2.c = null;
            this.F = fbaVar;
        }
    }

    public List f(CharSequence charSequence) {
        charSequence.getClass();
        sig sigVar = new sig((xzd) this.G, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (sigVar.hasNext()) {
            arrayList.add((String) sigVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void g(List list, int i, List list2, boolean z) {
        list.getClass();
        list2.getClass();
        this.F = w44.p1(list.subList(0, i));
        this.G = w44.p1(list2);
        this.E = z;
    }

    @Override // defpackage.zr9
    public boolean h(u9i u9iVar, u9i u9iVar2) {
        boolean z = this.E;
        c92 c92Var = (c92) this.F;
        c92 c92Var2 = (c92) this.G;
        c92Var.getClass();
        c92Var2.getClass();
        u9iVar.getClass();
        u9iVar2.getClass();
        int i = 1;
        if (u9iVar.equals(u9iVar2)) {
            return true;
        }
        xh3 xh3VarA = u9iVar.a();
        xh3 xh3VarA2 = u9iVar2.a();
        if ((xh3VarA instanceof qai) && (xh3VarA2 instanceof qai)) {
            return lyk.L.g((qai) xh3VarA, (qai) xh3VarA2, z, new z00(c92Var, i, c92Var2));
        }
        return false;
    }

    public String i() {
        return (String) this.F;
    }

    public String k() {
        return (String) this.G;
    }

    @Override // defpackage.t5k
    public void l() {
        dba dbaVar;
        synchronized (this) {
            this.E = false;
            dbaVar = ((fba) this.F).c;
        }
        if (dbaVar != null) {
            ((snj) this.G).b(dbaVar, 2441);
        }
    }

    public boolean m() {
        return this.E;
    }

    @Override // defpackage.t5k
    public synchronized fba zza() {
        return (fba) this.F;
    }

    public m11(String str, x2 x2Var, boolean z) {
        this.F = str;
        this.G = x2Var;
        this.E = z;
    }

    public m11(xzd xzdVar, boolean z, ki2 ki2Var) {
        this.G = xzdVar;
        this.E = z;
        this.F = ki2Var;
    }

    public m11() {
        lm6 lm6Var = lm6.E;
        this.F = lm6Var;
        this.G = lm6Var;
    }
}

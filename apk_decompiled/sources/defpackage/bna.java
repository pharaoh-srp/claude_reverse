package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class bna {
    public HashMap c;
    public HashMap d;
    public float e;
    public HashMap f;
    public ArrayList g;
    public jgg h;
    public zka i;
    public ArrayList j;
    public Rect k;
    public float l;
    public float m;
    public float n;
    public boolean o;
    public final hz4 a = new hz4(1);
    public final HashSet b = new HashSet();
    public int p = 0;

    public final void a(String str) {
        oga.a(str);
        this.b.add(str);
    }

    public final float b() {
        return (long) (((this.m - this.l) / this.n) * 1000.0f);
    }

    public final Map c() {
        float fC = zpi.c();
        if (fC != this.e) {
            for (Map.Entry entry : this.d.entrySet()) {
                HashMap map = this.d;
                String str = (String) entry.getKey();
                rna rnaVar = (rna) entry.getValue();
                float f = this.e / fC;
                int i = (int) (rnaVar.a * f);
                int i2 = (int) (rnaVar.b * f);
                rna rnaVar2 = new rna(rnaVar.c, rnaVar.d, i, i2, rnaVar.e);
                Bitmap bitmap = rnaVar.f;
                if (bitmap != null) {
                    rnaVar2.f = Bitmap.createScaledBitmap(bitmap, i, i2, true);
                }
                map.put(str, rnaVar2);
            }
        }
        this.e = fC;
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            sb.append(((rt9) it.next()).a("\t"));
        }
        return sb.toString();
    }
}

package com.google.android.gms.internal.measurement;

import defpackage.b0l;
import defpackage.bnh;
import defpackage.grc;
import defpackage.ij0;
import defpackage.lzk;
import defpackage.mr9;
import defpackage.myk;
import defpackage.ozk;
import defpackage.suk;
import defpackage.sxk;
import defpackage.xh6;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class l0 {
    protected int zza;

    public static void b(Iterable iterable, List list) {
        Charset charset = sxk.a;
        iterable.getClass();
        if (!(iterable instanceof myk)) {
            if (iterable instanceof lzk) {
                list.addAll((Collection) iterable);
                return;
            }
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
            }
            int size = list.size();
            for (Object obj : iterable) {
                if (obj == null) {
                    String strU = grc.u("Element at index ", list.size() - size, " is null.");
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    mr9.h(strU);
                    return;
                }
                list.add(obj);
            }
            return;
        }
        List listM1200zza = ((myk) iterable).m1200zza();
        myk mykVar = (myk) list;
        int size3 = list.size();
        for (Object obj2 : listM1200zza) {
            if (obj2 == null) {
                String strU2 = grc.u("Element at index ", mykVar.size() - size3, " is null.");
                for (int size4 = mykVar.size() - 1; size4 >= size3; size4--) {
                    mykVar.remove(size4);
                }
                mr9.h(strU2);
                return;
            }
            if (obj2 instanceof suk) {
                mykVar.m1201zza();
            } else if (obj2 instanceof byte[]) {
                byte[] bArr = (byte[]) obj2;
                suk.e(bArr, 0, bArr.length);
                mykVar.m1201zza();
            } else {
                mykVar.add((String) obj2);
            }
        }
    }

    public abstract int a(b0l b0lVar);

    public final byte[] c() {
        try {
            int iA = ((n0) this).a(null);
            byte[] bArr = new byte[iA];
            m0 m0Var = new m0(bArr, iA);
            n0 n0Var = (n0) this;
            ozk ozkVar = ozk.c;
            ozkVar.getClass();
            b0l b0lVarA = ozkVar.a(n0Var.getClass());
            bnh bnhVar = m0Var.a;
            if (bnhVar == null) {
                bnhVar = new bnh(m0Var);
            }
            b0lVarA.g(n0Var, bnhVar);
            if (m0Var.f() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            xh6.f(ij0.j("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }
}

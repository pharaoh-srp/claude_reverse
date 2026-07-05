package defpackage;

import android.content.Context;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes3.dex */
public final class qm8 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Context F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qm8(Context context, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = context;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Context context = this.F;
        switch (i) {
            case 0:
                return new qm8(context, tp4Var, 0);
            default:
                return new qm8(context, tp4Var, 1);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((qm8) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws IOException {
        BufferedReader bufferedReader;
        int i = this.E;
        Context context = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                InputStream inputStreamOpen = context.getAssets().open("highlight.min.js");
                inputStreamOpen.getClass();
                bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, dj2.a), FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
                try {
                    String strG0 = d4c.g0(bufferedReader);
                    bufferedReader.close();
                    return strG0;
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            default:
                sf5.h0(obj);
                InputStream inputStreamOpen2 = context.getAssets().open("token-highlight.js");
                inputStreamOpen2.getClass();
                bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen2, dj2.a), FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
                try {
                    String strG02 = d4c.g0(bufferedReader);
                    bufferedReader.close();
                    return strG02;
                } finally {
                }
        }
    }
}

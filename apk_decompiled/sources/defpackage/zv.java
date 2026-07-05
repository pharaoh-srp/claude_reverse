package defpackage;

import android.view.MotionEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.chat.messages.TextBlock;
import com.anthropic.claude.api.model.ModelSelectorEntry;
import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.bell.api.BellApiServerMessage;
import java.util.HashMap;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zv implements bz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ zv(int i) {
        this.E = i;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((Project) obj).getClass();
                return ind.F;
            case 1:
                iaj iajVar = (iaj) obj;
                iajVar.getClass();
                return iajVar.b;
            case 2:
                ((iaj) obj).getClass();
                return ik7.F;
            case 3:
                return (kub) obj;
            case 4:
                ((hx9) obj).getClass();
                return new za8(gvj.b(hx9.b));
            case 5:
                ((dr0) obj).getClass();
                return br0.F;
            case 6:
                ((hx9) obj).getClass();
                return new za8(gvj.b(hx9.b));
            case 7:
                ova ovaVar = (ova) obj;
                ovaVar.getClass();
                return nr0.a(bsg.n1(ovaVar.c(), '.', ',', ';', ':', '!'));
            case 8:
                ((ekf) obj).getClass();
                return ieiVar;
            case 9:
                ((t4f) obj).getClass();
                return ieiVar;
            case 10:
                return (t01) obj;
            case 11:
                cma cmaVar = (cma) obj;
                cmaVar.b(pqi.b, (int) (cmaVar.a().k() >> 32));
                cmaVar.b(pqi.a, MTTypesetterKt.kLineSkipLimitMultiplier);
                return ieiVar;
            case 12:
                yn6 yn6Var = (yn6) obj;
                yn6Var.getClass();
                return new cpc(Double.valueOf(yn6Var.b()), "kcal");
            case 13:
                ((ekf) obj).getClass();
                return ieiVar;
            case 14:
                ekf ekfVar = (ekf) obj;
                ekfVar.getClass();
                ckf.e(ekfVar);
                return ieiVar;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                int i2 = bg1.b;
                return ieiVar;
            case 16:
                Long l = (Long) obj;
                l.longValue();
                return l;
            case g.MAX_FIELD_NUMBER /* 17 */:
                og9 og9Var = (og9) obj;
                og9Var.getClass();
                og9Var.a = true;
                og9Var.c = true;
                og9Var.b = false;
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                HashMap map3 = new HashMap();
                HashMap map4 = new HashMap();
                HashMap map5 = new HashMap();
                pl9 pl9VarB = jce.a.b(BellApiServerMessage.class);
                zv zvVar = new zv(18);
                bz7 bz7Var = (bz7) map5.get(pl9VarB);
                if (bz7Var != null && !bz7Var.equals(zvVar)) {
                    pmf.i("Default deserializers provider for ", pl9VarB, " is already registered: ", bz7Var);
                    return null;
                }
                map5.put(pl9VarB, zvVar);
                og9Var.k = new nnf(map, map2, map3, map4, map5, false);
                return ieiVar;
            case g.AVG_FIELD_NUMBER /* 18 */:
                return BellApiServerMessage.Unknown.INSTANCE.serializer();
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ieiVar;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ((MotionEvent) obj).getClass();
                return Boolean.FALSE;
            case 21:
                ((MotionEvent) obj).getClass();
                return Boolean.FALSE;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ((TextBlock) obj).getText();
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                sdd sddVar = (sdd) obj;
                sddVar.getClass();
                return new cpc(Double.valueOf(sddVar.E), "mmHg");
            case 24:
                ((cv9) obj).a();
                return ieiVar;
            case BuildConfig.VERSION_CODE /* 25 */:
                og9 og9Var2 = (og9) obj;
                og9Var2.getClass();
                og9Var2.c = true;
                return ieiVar;
            case 26:
                WebView webView = (WebView) obj;
                webView.getClass();
                WebSettings settings = webView.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setDomStorageEnabled(true);
                return ieiVar;
            case 27:
                WebView webView2 = (WebView) obj;
                webView2.getClass();
                webView2.stopLoading();
                webView2.destroy();
                return ieiVar;
            case 28:
                ((ekf) obj).getClass();
                return ieiVar;
            default:
                ModelSelectorEntry modelSelectorEntry = (ModelSelectorEntry) obj;
                modelSelectorEntry.getClass();
                return modelSelectorEntry.m364getIdi4oh0I();
        }
    }
}

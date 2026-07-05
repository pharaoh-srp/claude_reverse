package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.MTMathView;
import com.agog.mathdisplay.parse.MathDisplayException;
import com.agog.mathdisplay.parse.MissingGlyphException;
import com.anthropic.claude.analytics.events.ProjectsEvents$ProjectFileSource;
import com.anthropic.claude.markdown.latex.LatexRenderFailure;
import java.io.File;
import java.util.List;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ol5 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ nwb F;

    public /* synthetic */ ol5(int i, nwb nwbVar) {
        this.E = i;
        this.F = nwbVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        nwb nwbVar = this.F;
        switch (i) {
            case 0:
                ekf ekfVar = (ekf) obj;
                if (!bsg.I0((CharSequence) nwbVar.getValue())) {
                    String str = (String) nwbVar.getValue();
                    wn9[] wn9VarArr = ckf.a;
                    ekfVar.a(akf.O, str);
                }
                break;
            case 1:
                nwbVar.setValue(Integer.valueOf((int) (((g79) obj).a & 4294967295L)));
                break;
            case 2:
                Float f = (Float) obj;
                f.getClass();
                ((bz7) nwbVar.getValue()).invoke(f);
                break;
            case 3:
                ((Boolean) obj).getClass();
                nwbVar.setValue(Boolean.valueOf(!((Boolean) nwbVar.getValue()).booleanValue()));
                break;
            case 4:
                if (((Boolean) obj).booleanValue()) {
                    nwbVar.setValue(Boolean.TRUE);
                }
                break;
            case 5:
                Uri uri = (Uri) obj;
                if (uri != null) {
                    ((bz7) nwbVar.getValue()).invoke(x44.W(uri));
                }
                break;
            case 6:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                nwbVar.setValue(bool);
                break;
            case 7:
                z7d z7dVar = (z7d) obj;
                nwbVar.setValue(new fcc(fcc.i(((fcc) nwbVar.getValue()).a, hvj.r(z7dVar, false))));
                z7dVar.a();
                break;
            case 8:
                List list = (List) obj;
                list.getClass();
                if (!list.isEmpty()) {
                    ((pz7) nwbVar.getValue()).invoke(list, ProjectsEvents$ProjectFileSource.PROJECT_FILE_FILE_PICKER);
                }
                break;
            case 9:
                File file = (File) obj;
                if (file != null) {
                    ((pz7) nwbVar.getValue()).invoke(x44.W(Uri.fromFile(file)), ProjectsEvents$ProjectFileSource.PROJECT_FILE_CAMERA);
                }
                break;
            case 10:
                List list2 = (List) obj;
                list2.getClass();
                if (!list2.isEmpty()) {
                    ((pz7) nwbVar.getValue()).invoke(list2, ProjectsEvents$ProjectFileSource.PROJECT_FILE_LIBRARY);
                }
                break;
            case 11:
                Context context = (Context) obj;
                context.getClass();
                MTMathView mTMathView = new MTMathView(context, null, 0, 6, null);
                mTMathView.setDisplayErrorInline(false);
                it9 it9Var = new it9(context, mTMathView, new ol5(12, nwbVar));
                it9Var.setImportantForAccessibility(4);
                break;
            case 12:
                MathDisplayException mathDisplayException = (MathDisplayException) obj;
                mathDisplayException.getClass();
                List list3 = xah.a;
                LatexRenderFailure latexRenderFailure = new LatexRenderFailure(mathDisplayException instanceof MissingGlyphException ? grc.p(((MissingGlyphException) mathDisplayException).getGlyphSlot(), "missing glyph slot ") : "non-glyph render failure");
                latexRenderFailure.setStackTrace(mathDisplayException.getStackTrace());
                xah.f(latexRenderFailure, "LaTeX render failed, swapping to plain-text fallback", ozf.F, null, 24);
                nwbVar.setValue(Boolean.TRUE);
                break;
            case 13:
                ((Boolean) obj).getClass();
                ((zy7) nwbVar.getValue()).a();
                break;
            case 14:
                nwbVar.setValue((g79) obj);
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                String str2 = (String) obj;
                str2.getClass();
                nwbVar.setValue(str2);
                break;
            case 16:
                nwbVar.setValue((String) obj);
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                nwbVar.setValue(bool2);
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                nwbVar.setValue((String) obj);
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                nwbVar.setValue(bool3);
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ((w86) obj).getClass();
                break;
            case 21:
                pc pcVar = (pc) obj;
                pcVar.getClass();
                ValueCallback valueCallback = (ValueCallback) nwbVar.getValue();
                if (valueCallback != null) {
                    valueCallback.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(pcVar.E, pcVar.F));
                }
                nwbVar.setValue(null);
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                String str3 = (String) obj;
                str3.getClass();
                nwbVar.setValue(str3);
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                String str4 = (String) obj;
                str4.getClass();
                nwbVar.setValue(str4);
                break;
            case 24:
                nwbVar.setValue((cu9) obj);
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                Context context2 = (Context) obj;
                context2.getClass();
                break;
            case 26:
                View view = (View) obj;
                view.getClass();
                nwbVar.setValue(view);
                break;
            case 27:
                String str5 = (String) obj;
                str5.getClass();
                nwbVar.setValue(str5);
                break;
            case 28:
                String str6 = (String) obj;
                str6.getClass();
                ((bz7) nwbVar.getValue()).invoke(str6);
                break;
            default:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                nwbVar.setValue(bool4);
                break;
        }
        return ieiVar;
    }
}

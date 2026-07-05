package defpackage;

import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController;
import androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController;
import androidx.health.platform.client.proto.g;
import androidx.work.WorkerParameters;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.chat.input.files.FileUploadWorker;
import com.anthropic.claude.configs.flags.ConditionalMcpDirectoryServersConfig;
import com.anthropic.claude.project.details.custominstructions.c;
import com.anthropic.claude.project.details.custominstructions.d;
import com.squareup.wire.internal.FieldOrOneOfBinding;
import com.squareup.wire.internal.MathMethodsKt;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xi4 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ xi4(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    @Override // defpackage.zy7
    public final Object a() {
        s2i s2iVar;
        vg5 vg5Var;
        int i = this.E;
        int i2 = 3;
        Object obj = this.F;
        switch (i) {
            case 0:
                ConditionalMcpDirectoryServersConfig conditionalMcpDirectoryServersConfig = (ConditionalMcpDirectoryServersConfig) ((b1i) obj).o.getValue();
                List<String> visibility = conditionalMcpDirectoryServersConfig != null ? conditionalMcpDirectoryServersConfig.getVisibility() : null;
                return visibility == null ? lm6.E : visibility;
            case 1:
                beg begVar = (beg) obj;
                if (begVar != null) {
                    ((fx5) begVar).a();
                }
                return iei.a;
            case 2:
                yfd.T((g35) obj);
                return iei.a;
            case 3:
                return CreateDigitalCredentialController.handleResponse$lambda$2((CreateDigitalCredentialController) obj);
            case 4:
                return CredentialProviderBeginSignInController.invokePlayServices$lambda$0$0((CredentialProviderBeginSignInController) obj);
            case 5:
                return CredentialProviderCreatePasswordController.invokePlayServices$lambda$0$0((CredentialProviderCreatePasswordController) obj);
            case 6:
                return CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$2$0((CredentialProviderCreatePublicKeyCredentialController) obj);
            case 7:
                return CredentialProviderGetSignInIntentController.invokePlayServices$lambda$1$0((CredentialProviderGetSignInIntentController) obj);
            case 8:
                String str = (String) ((nyj) obj).G;
                Locale locale = Locale.US;
                return ij0.C(str, ": ", "Error while finalizing DDTracer.");
            case 9:
                return Float.valueOf(((noh) obj).E.b());
            case 10:
                ((meh) obj).close();
                return iei.a;
            case 11:
                q2i q2iVar = ((b9i) obj).o;
                return Float.valueOf((q2iVar == null || (s2iVar = ((g77) q2iVar).a) == null) ? MTTypesetterKt.kLineSkipLimitMultiplier : s2iVar.a());
            case 12:
                d dVar = (d) obj;
                gb9.D(dVar.a, null, null, new c(dVar, null), 3);
                return iei.a;
            case 13:
                return FieldOrOneOfBinding.adapter_delegate$lambda$0((FieldOrOneOfBinding) obj);
            case 14:
                Float f = (Float) obj;
                f.floatValue();
                return f;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                cpc[] cpcVarArr = {new cpc("progress", Float.valueOf(-1.0f))};
                vf3 vf3Var = new vf3(1);
                cpc cpcVar = cpcVarArr[0];
                vf3Var.d((String) cpcVar.E, cpcVar.F);
                pf5 pf5VarB = vf3Var.b();
                WorkerParameters workerParameters = ((FileUploadWorker) obj).b;
                mgj mgjVar = workerParameters.f;
                rwj.i(mgjVar.b.a, "updateProgress", new fui(mgjVar, workerParameters.a, pf5VarB, i2));
                return iei.a;
            case 16:
                m68 m68Var = (m68) obj;
                synchronized (m68.d) {
                    try {
                        vg5Var = m68.f;
                        if (vg5Var == null) {
                            File fileK = xvj.k(m68Var.a, "GlanceAppWidgetManager");
                            File file = fileK.exists() ? fileK : null;
                            if (file != null) {
                                file.delete();
                            }
                            vg5Var = (vg5) m68.e.a(m68Var.a, l68.a[0]);
                            m68.f = vg5Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return vg5Var;
            case g.MAX_FIELD_NUMBER /* 17 */:
                return Boolean.valueOf(((j9f) obj).d());
            case g.AVG_FIELD_NUMBER /* 18 */:
                id8 id8Var = (id8) obj;
                id8Var.e.e();
                id8Var.O();
                return iei.a;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ubi ubiVar = ((jm8) obj).Z;
                if (ubiVar == null) {
                    throw vb7.x("Font resolution state is not set.");
                }
                ubiVar.getValue();
                return iei.a;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                zr8 zr8Var = (zr8) obj;
                zr8Var.getClass();
                try {
                    zr8Var.b0.j(2, 0, false);
                    break;
                } catch (IOException e) {
                    xr6 xr6Var = xr6.PROTOCOL_ERROR;
                    zr8Var.c(xr6Var, xr6Var, e);
                }
                return iei.a;
            case 21:
                return Boolean.valueOf(((gkj) obj).c() > 1.01f);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                Object systemService = ((View) ((i49) obj).F).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                b89 b89Var = (b89) obj;
                long jLongValue = ((Number) b89Var.F.a()).longValue();
                cae caeVar = new cae();
                cae caeVar2 = new cae();
                synchronized (b89Var.H) {
                    caeVar.E = jLongValue - b89Var.J;
                    caeVar2.E = MathMethodsKt.NANOS_PER_SECOND / ((long) b89Var.I);
                }
                gb9.D(b89Var.E, null, null, new p0(caeVar, caeVar2, b89Var, jLongValue, (tp4) null), 3);
                return iei.a;
            case 24:
                ((md9) obj).c.clear();
                return iei.a;
            case BuildConfig.VERSION_CODE /* 25 */:
                ((ii7) obj).f.setValue(Boolean.valueOf(!((Boolean) r14.getValue()).booleanValue()));
                return iei.a;
            case 26:
                return new BaseInputConnection(((n2a) obj).E, false);
            case 27:
                return (String) ((poa) obj).m.getValue();
            case 28:
                cu9 cu9Var = (cu9) ((hpa) obj).e0.getValue();
                return new fcc(cu9Var != null ? cu9Var.K(0L) : 9205357640488583168L);
            default:
                return ((qya) obj).getCallbacks();
        }
    }
}

package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController;
import androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController;
import androidx.health.platform.client.proto.g;
import androidx.work.WorkerParameters;
import com.anthropic.claude.chat.input.files.FileUploadWorker;
import com.anthropic.claude.conway.protocol.StreamMessage;
import com.squareup.wire.GrpcCalls$GrpcStreamingCall$1;
import com.squareup.wire.Message;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.FieldBinding;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class py3 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ py3(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        String strConcat;
        StringBuilder sb;
        int i;
        int i2 = this.E;
        boolean z = false;
        z = false;
        iei ieiVar = iei.a;
        Object obj2 = this.F;
        switch (i2) {
            case 0:
                ((w86) obj).getClass();
                throw null;
            case 1:
                n56 n56Var = (n56) obj;
                n56Var.getClass();
                amg amgVar = ((uj4) obj2).i;
                amgVar.getClass();
                amgVar.n(null, n56Var);
                return ieiVar;
            case 2:
                ekf ekfVar = (ekf) obj;
                ekfVar.getClass();
                ckf.t(ekfVar, ((zv4) obj2).e);
                return ieiVar;
            case 3:
                ((Context) obj).getClass();
                WebView webView = ((iw4) obj2).a;
                ViewParent parent = webView.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(webView);
                }
                return webView;
            case 4:
                ekf ekfVar2 = (ekf) obj;
                ekfVar2.getClass();
                ckf.l(ekfVar2, ((pw4) obj2).b);
                return ieiVar;
            case 5:
                ((aid) obj2).r((StreamMessage) obj);
                return ieiVar;
            case 6:
                return CreateDigitalCredentialController.handleResponse$lambda$1((CreateDigitalCredentialController) obj2, (CreateCredentialException) obj);
            case 7:
                return CreatePasswordCredentialController.handleResponse$lambda$1((CreatePasswordCredentialController) obj2, (CreateCredentialException) obj);
            case 8:
                return CreatePublicKeyCredentialController.handleResponse$lambda$1((CreatePublicKeyCredentialController) obj2, (CreateCredentialException) obj);
            case 9:
                return CredentialProviderBeginSignInController.handleResponse$lambda$1((CredentialProviderBeginSignInController) obj2, (GetCredentialException) obj);
            case 10:
                return CredentialProviderCreatePasswordController.handleResponse$lambda$1((CredentialProviderCreatePasswordController) obj2, (CreateCredentialException) obj);
            case 11:
                return CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$1((CredentialProviderCreatePublicKeyCredentialController) obj2, (CreateCredentialException) obj);
            case 12:
                return CredentialProviderGetSignInIntentController.handleResponse$lambda$1((CredentialProviderGetSignInIntentController) obj2, (GetCredentialException) obj);
            case 13:
                ckf.l((ekf) obj, (String) ((cpc) obj2).E);
                return ieiVar;
            case 14:
                float fFloatValue = ((Float) obj).floatValue();
                s2i s2iVar = ((g77) ((b9i) obj2).o).a;
                s2iVar.d(s2iVar.c.h() + fFloatValue);
                return ieiVar;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                x5a x5aVar = (x5a) obj2;
                String str = (String) obj;
                str.getClass();
                x5aVar.getClass();
                x5aVar.b.setValue(str);
                return ieiVar;
            case 16:
                ((u66) obj2).P = true;
                return ieiVar;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ij6 ij6Var = (ij6) obj;
                String str2 = ((ij6) obj2) == ij6Var ? " > " : "   ";
                if (ij6Var instanceof n74) {
                    sb = new StringBuilder("CommitTextCommand(text.length=");
                    n74 n74Var = (n74) ij6Var;
                    sb.append(n74Var.a.F.length());
                    sb.append(", newCursorPosition=");
                    i = n74Var.b;
                } else {
                    if (!(ij6Var instanceof rwf)) {
                        if (ij6Var instanceof qwf) {
                            strConcat = ((qwf) ij6Var).toString();
                        } else if (ij6Var instanceof ry5) {
                            strConcat = ((ry5) ij6Var).toString();
                        } else if (ij6Var instanceof sy5) {
                            strConcat = ((sy5) ij6Var).toString();
                        } else if (ij6Var instanceof wwf) {
                            strConcat = ((wwf) ij6Var).toString();
                        } else if (ij6Var instanceof jl7) {
                            strConcat = "FinishComposingTextCommand()";
                        } else if (ij6Var instanceof ux5) {
                            strConcat = "DeleteAllCommand()";
                        } else {
                            String strF = jce.a.b(ij6Var.getClass()).f();
                            if (strF == null) {
                                strF = "{anonymous EditCommand}";
                            }
                            strConcat = "Unknown EditCommand: ".concat(strF);
                        }
                        return str2.concat(strConcat);
                    }
                    sb = new StringBuilder("SetComposingTextCommand(text.length=");
                    rwf rwfVar = (rwf) ij6Var;
                    sb.append(rwfVar.a.F.length());
                    sb.append(", newCursorPosition=");
                    i = rwfVar.b;
                }
                strConcat = vb7.r(sb, i, ')');
                return str2.concat(strConcat);
            case g.AVG_FIELD_NUMBER /* 18 */:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((ha7) obj2).g.setValue(bool);
                return ieiVar;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return FieldBinding.getBuilderGetter$lambda$3((WireField) obj2, (Message.Builder) obj);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return FieldBinding.getBuilderGetter$lambda$4((Field) obj2, (Message.Builder) obj);
            case 21:
                return FieldBinding.getInstanceGetter$lambda$6((Method) obj2, (Message) obj);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return FieldBinding.getInstanceGetter$lambda$7((FieldBinding) obj2, (Message) obj);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ck7 ck7Var = (ck7) obj2;
                nf0 nf0Var = (nf0) obj;
                nf0Var.getClass();
                if (cmk.q(nf0Var) && ck7Var.i.b()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 24:
                Float f = (Float) obj;
                f.getClass();
                cpc[] cpcVarArr = {new cpc("progress", f)};
                vf3 vf3Var = new vf3(1);
                cpc cpcVar = cpcVarArr[0];
                vf3Var.d((String) cpcVar.E, cpcVar.F);
                pf5 pf5VarB = vf3Var.b();
                WorkerParameters workerParameters = ((FileUploadWorker) obj2).b;
                mgj mgjVar = workerParameters.f;
                rwj.i(mgjVar.b.a, "updateProgress", new fui(mgjVar, workerParameters.a, pf5VarB, 3));
                return ieiVar;
            case BuildConfig.VERSION_CODE /* 25 */:
                wwb wwbVar = (wwb) obj2;
                Object[] objArr = wwbVar.E;
                int i3 = wwbVar.G;
                for (int i4 = 0; i4 < i3; i4++) {
                    ((p5b) objArr[i4]).d();
                }
                return ieiVar;
            case 26:
                id8 id8Var = (id8) obj2;
                n18 n18Var = (n18) obj;
                n18Var.getClass();
                String str3 = n18Var.a;
                id8Var.getClass();
                str3.getClass();
                id8Var.e.j(str3);
                id8Var.O();
                return ieiVar;
            case 27:
                return GrpcCalls$GrpcStreamingCall$1.executeIn$lambda$1((GrpcCalls$GrpcStreamingCall$1) obj2, (Throwable) obj);
            case 28:
                sk8 sk8Var = (sk8) obj;
                sk8Var.getClass();
                String string = ((cj8) obj2).e.getString(sk8Var.b);
                string.getClass();
                return string;
            default:
                ((hi6) obj2).F(xme.a);
                return ieiVar;
        }
    }

    public /* synthetic */ py3(Object obj, int i, Object obj2) {
        this.E = i;
        this.F = obj;
    }
}

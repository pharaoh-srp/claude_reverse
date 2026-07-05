package defpackage;

import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.analytics.events.PushEvents$FailureCause;
import com.anthropic.claude.analytics.events.PushEvents$PushRegistrationFailure;
import com.anthropic.claude.analytics.events.ReadAloudEvents$ReadAloudInterruptReason;
import com.anthropic.claude.analytics.events.ScreenSource;
import com.anthropic.claude.api.account.RateLimitUpsell;
import com.anthropic.claude.api.account.RavenType;
import com.anthropic.claude.api.chat.tool.RichItemsDisplayContent;
import com.anthropic.claude.api.common.RateLimit;
import com.anthropic.claude.configs.flags.SendRetryConfig;
import com.anthropic.claude.stt.repo.api.STTApiMessage;
import com.anthropic.claude.tool.custom.RecipeDisplayOutput;
import com.anthropic.claude.tool.model.PresentFilesInput;
import com.anthropic.claude.tool.model.RecipeDisplayV0Input;
import com.anthropic.claude.tool.model.RequestFormInputFromUserInput;
import com.anthropic.claude.tool.model.SearchMcpRegistryInput;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zcd implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ zcd(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        int i = 0;
        Object obj = null;
        switch (this.E) {
            case 0:
                return PresentFilesInput._childSerializers$_anonymous_();
            case 1:
                return new mxd(new a80(Float.valueOf(MTTypesetterKt.kLineSkipLimitMultiplier), dgj.f, obj, 12));
            case 2:
                return PushEvents$FailureCause._init_$_anonymous_();
            case 3:
                return PushEvents$PushRegistrationFailure._childSerializers$_anonymous_();
            case 4:
                return RateLimit.WithinLimit._init_$_anonymous_();
            case 5:
                return RateLimitUpsell._init_$_anonymous_();
            case 6:
                return RavenType._init_$_anonymous_();
            case 7:
                return ReadAloudEvents$ReadAloudInterruptReason._init_$_anonymous_();
            case 8:
                List listI1 = w44.i1(cpf.b(), new g67(21));
                ArrayList arrayList = new ArrayList();
                int size = listI1.size();
                while (i < size) {
                    jh7 jh7Var = (jh7) listI1.get(i);
                    jh7Var.getClass();
                    fh7 fh7VarA = jh7Var.a();
                    pl9 pl9VarType = jh7Var.type();
                    cpc cpcVar = pl9VarType == null ? null : new cpc(fh7VarA, pl9VarType);
                    if (cpcVar != null) {
                        arrayList.add(cpcVar);
                    }
                    i++;
                }
                return arrayList;
            case 9:
                List listI12 = w44.i1(cpf.a(), new g67(22));
                ArrayList arrayList2 = new ArrayList();
                int size2 = listI12.size();
                while (i < size2) {
                    arrayList2.add(((uo5) listI12.get(i)).a());
                    i++;
                }
                return arrayList2;
            case 10:
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                return keyStore;
            case 11:
                return null;
            case 12:
                return RecipeDisplayOutput._childSerializers$_anonymous_();
            case 13:
                return RecipeDisplayV0Input._childSerializers$_anonymous_();
            case 14:
                return RecipeDisplayV0Input._childSerializers$_anonymous_$0();
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return Boolean.TRUE;
            case 16:
                return RequestFormInputFromUserInput._childSerializers$_anonymous_();
            case g.MAX_FIELD_NUMBER /* 17 */:
                return aoe.a;
            case g.AVG_FIELD_NUMBER /* 18 */:
                umg umgVar = dqe.a;
                return np5.a;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return RichItemsDisplayContent._childSerializers$_anonymous_();
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                xe4 xe4Var = due.a;
                return aue.c;
            case 21:
                throw new IllegalStateException("Root RouterContext was not provided");
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return STTApiMessage._init_$_anonymous_();
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new a5f(new LinkedHashMap());
            case 24:
                umg umgVar2 = e5f.a;
                return null;
            case BuildConfig.VERSION_CODE /* 25 */:
                return ScreenSource._init_$_anonymous_();
            case 26:
                return new j9f(0);
            case 27:
                return SearchMcpRegistryInput._childSerializers$_anonymous_();
            case 28:
                xe4 xe4Var2 = uif.a;
                return null;
            default:
                return SendRetryConfig._childSerializers$_anonymous_();
        }
    }
}

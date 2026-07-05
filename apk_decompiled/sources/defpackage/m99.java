package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.LoginEvents$AccountLoggedOut;
import com.anthropic.claude.analytics.events.LoginEvents$EmailLoginCodeSendError;
import com.anthropic.claude.analytics.events.LoginEvents$EmailLoginCodeVerificationError;
import com.anthropic.claude.analytics.events.LoginEvents$EmailLoginMagicLinkSendError;
import com.anthropic.claude.analytics.events.LoginEvents$EmailLoginMagicLinkVerificationError;
import com.anthropic.claude.analytics.events.LoginEvents$EmailLoginSSOVerificationError;
import com.anthropic.claude.api.kyc.KycStatus;
import com.anthropic.claude.app.main.loggedin.LoggedInScreens;
import com.anthropic.claude.sessions.types.ListSelfHostedRunnerPoolsResponse;
import com.anthropic.claude.sessions.types.ListSessionsResponse;
import com.anthropic.claude.settings.internal.InternalSettingsAppScreen;
import com.anthropic.claude.tool.model.KnowledgeSource;
import com.anthropic.claude.tool.model.LocationPreviewData;
import com.mikepenz.aboutlibraries.Libs;
import com.mikepenz.aboutlibraries.entity.Library;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m99 implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ m99(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.E) {
            case 0:
                return InternalSettingsAppScreen.NetworkSimulationScreen._init_$_anonymous_();
            case 1:
                return InternalSettingsAppScreen.PushSettingsScreen._init_$_anonymous_();
            case 2:
                return mpk.P(new fcc(9205357640488583168L));
            case 3:
                return KnowledgeSource._childSerializers$_anonymous_();
            case 4:
                pl9 pl9VarB = jce.a.b(u1d.class);
                er9 er9Var = zp3.J;
                if (er9Var != null) {
                    return ((m7f) er9Var.c.I).a(pl9VarB, null, null);
                }
                sz6.j("KoinApplication has not been started");
                return null;
            case 5:
                return KycStatus._init_$_anonymous_();
            case 6:
                return Library._childSerializers$_anonymous_();
            case 7:
                return Library._childSerializers$_anonymous_$0();
            case 8:
                return Library._childSerializers$_anonymous_$1();
            case 9:
                return Libs._childSerializers$_anonymous_();
            case 10:
                return Libs._childSerializers$_anonymous_$0();
            case 11:
                xe4 xe4Var = p6a.a;
                return null;
            case 12:
                return new t6a();
            case 13:
                return ListSelfHostedRunnerPoolsResponse._childSerializers$_anonymous_();
            case 14:
                return ListSessionsResponse._childSerializers$_anonymous_();
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                umg umgVar = wca.a;
                return p01.a;
            case 16:
                return d11.a;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ada adaVar = new ada(new dn0(0));
                gn5.c(adaVar);
                uvk.e(adaVar, '-');
                gn5.f(adaVar);
                uvk.e(adaVar, '-');
                en5.g(adaVar);
                return new bda(adaVar.build());
            case g.AVG_FIELD_NUMBER /* 18 */:
                ada adaVar2 = new ada(new dn0(0));
                gn5.c(adaVar2);
                gn5.f(adaVar2);
                en5.g(adaVar2);
                return new bda(adaVar2.build());
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ida idaVar = new ida(new dn0(0));
                f1 f1Var = (f1) cda.a.getValue();
                f1Var.getClass();
                idaVar.e(((bda) f1Var).a);
                uvk.d(idaVar, new bz7[]{new e69(19)}, new e69(20));
                aea aeaVar = (aea) bea.a.getValue();
                aeaVar.getClass();
                idaVar.d(aeaVar.a);
                return new jda(idaVar.build());
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                xe4 xe4Var2 = vda.a;
                return null;
            case 21:
                zda zdaVar = new zda(new dn0(0));
                fnc fncVar = fnc.E;
                zdaVar.d(new xe1(new jp8(fncVar)));
                uvk.e(zdaVar, ':');
                zdaVar.d(new xe1(new ukb(fncVar)));
                uvk.d(zdaVar, new bz7[]{new e69(21)}, new e69(22));
                return new aea(zdaVar.build());
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return LocationPreviewData._init_$_anonymous_();
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return LoggedInScreens.MinorBlocked._init_$_anonymous_();
            case 24:
                return LoginEvents$AccountLoggedOut._childSerializers$_anonymous_();
            case BuildConfig.VERSION_CODE /* 25 */:
                return LoginEvents$EmailLoginCodeSendError._childSerializers$_anonymous_();
            case 26:
                return LoginEvents$EmailLoginCodeVerificationError._childSerializers$_anonymous_();
            case 27:
                return LoginEvents$EmailLoginMagicLinkSendError._childSerializers$_anonymous_();
            case 28:
                return LoginEvents$EmailLoginMagicLinkVerificationError._childSerializers$_anonymous_();
            default:
                return LoginEvents$EmailLoginSSOVerificationError._childSerializers$_anonymous_();
        }
    }
}

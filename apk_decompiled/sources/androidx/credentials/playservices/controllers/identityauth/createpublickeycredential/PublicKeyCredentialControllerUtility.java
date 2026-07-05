package androidx.credentials.playservices.controllers.identityauth.createpublickeycredential;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import com.google.android.gms.fido.common.Transport;
import defpackage.a71;
import defpackage.b21;
import defpackage.b71;
import defpackage.bsg;
import defpackage.c71;
import defpackage.cpc;
import defpackage.d48;
import defpackage.dgj;
import defpackage.e71;
import defpackage.f88;
import defpackage.fd9;
import defpackage.g88;
import defpackage.i42;
import defpackage.ij0;
import defpackage.j6g;
import defpackage.k31;
import defpackage.kh7;
import defpackage.lz5;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.ome;
import defpackage.r;
import defpackage.rvd;
import defpackage.sh1;
import defpackage.sta;
import defpackage.svd;
import defpackage.sz6;
import defpackage.th1;
import defpackage.tta;
import defpackage.tvd;
import defpackage.uvd;
import defpackage.v98;
import defpackage.vvd;
import defpackage.w75;
import defpackage.wik;
import defpackage.wr6;
import defpackage.wvd;
import defpackage.x61;
import defpackage.xoi;
import defpackage.y61;
import defpackage.yvd;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/credentials/playservices/controllers/identityauth/createpublickeycredential/PublicKeyCredentialControllerUtility;", "", "<init>", "()V", "Companion", "GetGMSVersion", "credentials-play-services-auth"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class PublicKeyCredentialControllerUtility {
    private static final long AUTH_MIN_VERSION_JSON_CREATE = 241217000;
    private static final int FLAGS = 11;
    private static final String TAG = "PublicKeyUtility";
    private static final LinkedHashMap<wr6, r> orderedErrorCodeToExceptions;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String JSON_KEY_CLIENT_DATA = "clientDataJSON";
    private static final String JSON_KEY_ATTESTATION_OBJ = "attestationObject";
    private static final String JSON_KEY_AUTH_DATA = "authenticatorData";
    private static final String JSON_KEY_SIGNATURE = "signature";
    private static final String JSON_KEY_USER_HANDLE = "userHandle";
    private static final String JSON_KEY_RESPONSE = "response";
    private static final String JSON_KEY_ID = "id";
    private static final String JSON_KEY_RAW_ID = "rawId";
    private static final String JSON_KEY_TYPE = "type";
    private static final String JSON_KEY_RPID = "rpId";
    private static final String JSON_KEY_CHALLENGE = "challenge";
    private static final String JSON_KEY_APPID = "appid";
    private static final String JSON_KEY_THIRD_PARTY_PAYMENT = "thirdPartyPayment";
    private static final String JSON_KEY_AUTH_SELECTION = "authenticatorSelection";
    private static final String JSON_KEY_REQUIRE_RES_KEY = "requireResidentKey";
    private static final String JSON_KEY_RES_KEY = "residentKey";
    private static final String JSON_KEY_AUTH_ATTACHMENT = "authenticatorAttachment";
    private static final String JSON_KEY_TIMEOUT = "timeout";
    private static final String JSON_KEY_EXCLUDE_CREDENTIALS = "excludeCredentials";
    private static final String JSON_KEY_TRANSPORTS = "transports";
    private static final String JSON_KEY_RP = "rp";
    private static final String JSON_KEY_NAME = "name";
    private static final String JSON_KEY_ICON = "icon";
    private static final String JSON_KEY_ALG = "alg";
    private static final String JSON_KEY_USER = "user";
    private static final String JSON_KEY_DISPLAY_NAME = "displayName";
    private static final String JSON_KEY_USER_VERIFICATION_METHOD = "userVerificationMethod";
    private static final String JSON_KEY_KEY_PROTECTION_TYPE = "keyProtectionType";
    private static final String JSON_KEY_MATCHER_PROTECTION_TYPE = "matcherProtectionType";
    private static final String JSON_KEY_EXTENSTIONS = "extensions";
    private static final String JSON_KEY_ATTESTATION = "attestation";
    private static final String JSON_KEY_PUB_KEY_CRED_PARAMS = "pubKeyCredParams";
    private static final String JSON_KEY_CLIENT_EXTENSION_RESULTS = "clientExtensionResults";
    private static final String JSON_KEY_RK = "rk";
    private static final String JSON_KEY_CRED_PROPS = "credProps";

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Landroidx/credentials/playservices/controllers/identityauth/createpublickeycredential/PublicKeyCredentialControllerUtility$GetGMSVersion;", "", "<init>", "()V", "getVersionLong", "", "info", "Landroid/content/pm/PackageInfo;", "credentials-play-services-auth"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
    public static final class GetGMSVersion {
        public static final GetGMSVersion INSTANCE = new GetGMSVersion();

        private GetGMSVersion() {
        }

        public static final long getVersionLong(PackageInfo info) {
            info.getClass();
            return info.getLongVersionCode();
        }
    }

    static {
        cpc[] cpcVarArr = {new cpc(wr6.UNKNOWN_ERR, new r(26)), new cpc(wr6.ABORT_ERR, new r(0)), new cpc(wr6.ATTESTATION_NOT_PRIVATE_ERR, new r(16)), new cpc(wr6.CONSTRAINT_ERR, new r(1)), new cpc(wr6.DATA_ERR, new r(3)), new cpc(wr6.INVALID_STATE_ERR, new r(10)), new cpc(wr6.ENCODING_ERR, new r(4)), new cpc(wr6.NETWORK_ERR, new r(12)), new cpc(wr6.NOT_ALLOWED_ERR, new r(14)), new cpc(wr6.NOT_SUPPORTED_ERR, new r(17)), new cpc(wr6.SECURITY_ERR, new r(22)), new cpc(wr6.TIMEOUT_ERR, new r(24))};
        LinkedHashMap<wr6, r> linkedHashMap = new LinkedHashMap<>(tta.d0(12));
        sta.n0(linkedHashMap, cpcVarArr);
        orderedErrorCodeToExceptions = linkedHashMap;
    }

    public static final tvd convert(w75 w75Var, Context context) {
        return INSTANCE.convert(w75Var, context);
    }

    @Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\bM\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u000e\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u00132\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010\u001b\u001a\u00020&¢\u0006\u0004\b(\u0010)J!\u00100\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010\u0014H\u0000¢\u0006\u0004\b.\u0010/J\u001f\u00105\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b3\u00104J\u001f\u00107\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b6\u00104J\u001f\u00109\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b8\u00104J\u001f\u0010;\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b:\u00104J\u001f\u0010=\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b<\u00104J\u001f\u0010?\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b>\u00104J\u0015\u0010A\u001a\u00020\u00102\u0006\u0010@\u001a\u00020\u0014¢\u0006\u0004\bA\u0010BJ\u0015\u0010D\u001a\u00020\u00142\u0006\u0010C\u001a\u00020\u0010¢\u0006\u0004\bD\u0010EJ\u0015\u0010I\u001a\u00020H2\u0006\u0010G\u001a\u00020F¢\u0006\u0004\bI\u0010JJ\u001f\u0010M\u001a\u00020H2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010L\u001a\u00020KH\u0002¢\u0006\u0004\bM\u0010NJ\u0017\u0010O\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\bO\u0010PR\u001a\u0010Q\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u001a\u0010U\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\bU\u0010R\u001a\u0004\bV\u0010TR\u001a\u0010W\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\bW\u0010R\u001a\u0004\bX\u0010TR\u001a\u0010Y\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\bY\u0010R\u001a\u0004\bZ\u0010TR\u001a\u0010[\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\b[\u0010R\u001a\u0004\b\\\u0010TR\u001a\u0010]\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\b]\u0010R\u001a\u0004\b^\u0010TR\u001a\u0010_\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\b_\u0010R\u001a\u0004\b`\u0010TR\u001a\u0010a\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\ba\u0010R\u001a\u0004\bb\u0010TR\u001a\u0010c\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\bc\u0010R\u001a\u0004\bd\u0010TR\u001a\u0010e\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\be\u0010R\u001a\u0004\bf\u0010TR\u001a\u0010g\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\bg\u0010R\u001a\u0004\bh\u0010TR\u001a\u0010i\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\bi\u0010R\u001a\u0004\bj\u0010TR\u001a\u0010k\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\bk\u0010R\u001a\u0004\bl\u0010TR\u001a\u0010m\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\bm\u0010R\u001a\u0004\bn\u0010TR\u001a\u0010o\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\bo\u0010R\u001a\u0004\bp\u0010TR\u001a\u0010q\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\bq\u0010R\u001a\u0004\br\u0010TR\u001a\u0010s\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\bs\u0010R\u001a\u0004\bt\u0010TR\u001a\u0010u\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\bu\u0010R\u001a\u0004\bv\u0010TR\u001a\u0010w\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\bw\u0010R\u001a\u0004\bx\u0010TR\u001a\u0010y\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\by\u0010R\u001a\u0004\bz\u0010TR\u001a\u0010{\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\b{\u0010R\u001a\u0004\b|\u0010TR\u001a\u0010}\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\b}\u0010R\u001a\u0004\b~\u0010TR\u001b\u0010\u007f\u001a\u00020\u00148\u0000X\u0080D¢\u0006\r\n\u0004\b\u007f\u0010R\u001a\u0005\b\u0080\u0001\u0010TR\u001d\u0010\u0081\u0001\u001a\u00020\u00148\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010R\u001a\u0005\b\u0082\u0001\u0010TR\u001d\u0010\u0083\u0001\u001a\u00020\u00148\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010R\u001a\u0005\b\u0084\u0001\u0010TR\u001d\u0010\u0085\u0001\u001a\u00020\u00148\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010R\u001a\u0005\b\u0086\u0001\u0010TR\u001d\u0010\u0087\u0001\u001a\u00020\u00148\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010R\u001a\u0005\b\u0088\u0001\u0010TR\u001d\u0010\u0089\u0001\u001a\u00020\u00148\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010R\u001a\u0005\b\u008a\u0001\u0010TR\u001d\u0010\u008b\u0001\u001a\u00020\u00148\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010R\u001a\u0005\b\u008c\u0001\u0010TR\u001d\u0010\u008d\u0001\u001a\u00020\u00148\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010R\u001a\u0005\b\u008e\u0001\u0010TR\u001d\u0010\u008f\u0001\u001a\u00020\u00148\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010R\u001a\u0005\b\u0090\u0001\u0010TR\u001d\u0010\u0091\u0001\u001a\u00020\u00148\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010R\u001a\u0005\b\u0092\u0001\u0010TR\u001d\u0010\u0093\u0001\u001a\u00020\u00148\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010R\u001a\u0005\b\u0094\u0001\u0010TR\u001d\u0010\u0095\u0001\u001a\u00020\u00148\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0095\u0001\u0010R\u001a\u0005\b\u0096\u0001\u0010TR\u001d\u0010\u0097\u0001\u001a\u00020\u00148\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0097\u0001\u0010R\u001a\u0005\b\u0098\u0001\u0010TR?\u0010\u009c\u0001\u001a\"\u0012\u0004\u0012\u00020*\u0012\u0005\u0012\u00030\u009a\u00010\u0099\u0001j\u0010\u0012\u0004\u0012\u00020*\u0012\u0005\u0012\u00030\u009a\u0001`\u009b\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0017\u0010 \u0001\u001a\u00020K8\u0002X\u0082T¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u0017\u0010¢\u0001\u001a\u00020F8\u0002X\u0082T¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u0016\u0010¤\u0001\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0007\n\u0005\b¤\u0001\u0010R¨\u0006¥\u0001"}, d2 = {"Landroidx/credentials/playservices/controllers/identityauth/createpublickeycredential/PublicKeyCredentialControllerUtility$Companion;", "", "<init>", "()V", "Lw75;", "request", "Landroid/content/Context;", "context", "Ltvd;", "convert", "(Lw75;Landroid/content/Context;)Ltvd;", "Lorg/json/JSONObject;", "json", "convertJSON$credentials_play_services_auth", "(Lorg/json/JSONObject;)Ltvd;", "convertJSON", "", "clientDataJSON", "attestationObject", "", "", "transportArray", "Liei;", "addAuthenticatorAttestationResponse$credentials_play_services_auth", "([B[B[Ljava/lang/String;Lorg/json/JSONObject;)V", "addAuthenticatorAttestationResponse", "Lj6g;", "cred", "toAssertPasskeyResponse", "(Lj6g;)Ljava/lang/String;", "Ld48;", "option", "Lsh1;", "convertToPlayAuthPasskeyJsonRequest", "(Ld48;)Lsh1;", "Lth1;", "convertToPlayAuthPasskeyRequest", "(Ld48;)Lth1;", "Lrvd;", "Landroidx/credentials/exceptions/CreateCredentialException;", "publicKeyCredentialResponseContainsError", "(Lrvd;)Landroidx/credentials/exceptions/CreateCredentialException;", "Lwr6;", "code", "msg", "Landroidx/credentials/exceptions/GetCredentialException;", "beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth", "(Lwr6;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", "beginSignInPublicKeyCredentialResponseContainsError", "Lsvd;", "builder", "parseOptionalExtensions$credentials_play_services_auth", "(Lorg/json/JSONObject;Lsvd;)V", "parseOptionalExtensions", "parseOptionalAuthenticatorSelection$credentials_play_services_auth", "parseOptionalAuthenticatorSelection", "parseOptionalTimeout$credentials_play_services_auth", "parseOptionalTimeout", "parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth", "parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials", "parseRequiredRpAndParams$credentials_play_services_auth", "parseRequiredRpAndParams", "parseRequiredChallengeAndUser$credentials_play_services_auth", "parseRequiredChallengeAndUser", "str", "b64Decode", "(Ljava/lang/String;)[B", "data", "b64Encode", "([B)Ljava/lang/String;", "", "alg", "", "checkAlgSupported", "(I)Z", "", "version", "isDeviceGMSVersionOlderThan", "(Landroid/content/Context;J)Z", "getChallenge", "(Lorg/json/JSONObject;)[B", "JSON_KEY_CLIENT_DATA", "Ljava/lang/String;", "getJSON_KEY_CLIENT_DATA$credentials_play_services_auth", "()Ljava/lang/String;", "JSON_KEY_ATTESTATION_OBJ", "getJSON_KEY_ATTESTATION_OBJ$credentials_play_services_auth", "JSON_KEY_AUTH_DATA", "getJSON_KEY_AUTH_DATA$credentials_play_services_auth", "JSON_KEY_SIGNATURE", "getJSON_KEY_SIGNATURE$credentials_play_services_auth", "JSON_KEY_USER_HANDLE", "getJSON_KEY_USER_HANDLE$credentials_play_services_auth", "JSON_KEY_RESPONSE", "getJSON_KEY_RESPONSE$credentials_play_services_auth", "JSON_KEY_ID", "getJSON_KEY_ID$credentials_play_services_auth", "JSON_KEY_RAW_ID", "getJSON_KEY_RAW_ID$credentials_play_services_auth", "JSON_KEY_TYPE", "getJSON_KEY_TYPE$credentials_play_services_auth", "JSON_KEY_RPID", "getJSON_KEY_RPID$credentials_play_services_auth", "JSON_KEY_CHALLENGE", "getJSON_KEY_CHALLENGE$credentials_play_services_auth", "JSON_KEY_APPID", "getJSON_KEY_APPID$credentials_play_services_auth", "JSON_KEY_THIRD_PARTY_PAYMENT", "getJSON_KEY_THIRD_PARTY_PAYMENT$credentials_play_services_auth", "JSON_KEY_AUTH_SELECTION", "getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth", "JSON_KEY_REQUIRE_RES_KEY", "getJSON_KEY_REQUIRE_RES_KEY$credentials_play_services_auth", "JSON_KEY_RES_KEY", "getJSON_KEY_RES_KEY$credentials_play_services_auth", "JSON_KEY_AUTH_ATTACHMENT", "getJSON_KEY_AUTH_ATTACHMENT$credentials_play_services_auth", "JSON_KEY_TIMEOUT", "getJSON_KEY_TIMEOUT$credentials_play_services_auth", "JSON_KEY_EXCLUDE_CREDENTIALS", "getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth", "JSON_KEY_TRANSPORTS", "getJSON_KEY_TRANSPORTS$credentials_play_services_auth", "JSON_KEY_RP", "getJSON_KEY_RP$credentials_play_services_auth", "JSON_KEY_NAME", "getJSON_KEY_NAME$credentials_play_services_auth", "JSON_KEY_ICON", "getJSON_KEY_ICON$credentials_play_services_auth", "JSON_KEY_ALG", "getJSON_KEY_ALG$credentials_play_services_auth", "JSON_KEY_USER", "getJSON_KEY_USER$credentials_play_services_auth", "JSON_KEY_DISPLAY_NAME", "getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth", "JSON_KEY_USER_VERIFICATION_METHOD", "getJSON_KEY_USER_VERIFICATION_METHOD$credentials_play_services_auth", "JSON_KEY_KEY_PROTECTION_TYPE", "getJSON_KEY_KEY_PROTECTION_TYPE$credentials_play_services_auth", "JSON_KEY_MATCHER_PROTECTION_TYPE", "getJSON_KEY_MATCHER_PROTECTION_TYPE$credentials_play_services_auth", "JSON_KEY_EXTENSTIONS", "getJSON_KEY_EXTENSTIONS$credentials_play_services_auth", "JSON_KEY_ATTESTATION", "getJSON_KEY_ATTESTATION$credentials_play_services_auth", "JSON_KEY_PUB_KEY_CRED_PARAMS", "getJSON_KEY_PUB_KEY_CRED_PARAMS$credentials_play_services_auth", "JSON_KEY_CLIENT_EXTENSION_RESULTS", "getJSON_KEY_CLIENT_EXTENSION_RESULTS$credentials_play_services_auth", "JSON_KEY_RK", "getJSON_KEY_RK$credentials_play_services_auth", "JSON_KEY_CRED_PROPS", "getJSON_KEY_CRED_PROPS$credentials_play_services_auth", "Ljava/util/LinkedHashMap;", "Lr;", "Lkotlin/collections/LinkedHashMap;", "orderedErrorCodeToExceptions", "Ljava/util/LinkedHashMap;", "getOrderedErrorCodeToExceptions$credentials_play_services_auth", "()Ljava/util/LinkedHashMap;", "AUTH_MIN_VERSION_JSON_CREATE", "J", "FLAGS", "I", "TAG", "credentials-play-services-auth"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
    public static final class Companion {
        public /* synthetic */ Companion(mq5 mq5Var) {
            this();
        }

        private final byte[] getChallenge(JSONObject json) throws JSONException {
            String strOptString = json.optString(getJSON_KEY_CHALLENGE$credentials_play_services_auth(), "");
            strOptString.getClass();
            if (strOptString.length() != 0) {
                return b64Decode(strOptString);
            }
            throw new JSONException("Challenge not found in request or is unexpectedly empty");
        }

        private final boolean isDeviceGMSVersionOlderThan(Context context, long version) throws PackageManager.NameNotFoundException {
            long versionLong;
            if (f88.d.c(context, g88.a) != 0) {
                return false;
            }
            PackageManager packageManager = context.getPackageManager();
            packageManager.getClass();
            if (Build.VERSION.SDK_INT >= 28) {
                PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.gms", 0);
                packageInfo.getClass();
                versionLong = GetGMSVersion.getVersionLong(packageInfo);
            } else {
                versionLong = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
            }
            return versionLong > version;
        }

        public final void addAuthenticatorAttestationResponse$credentials_play_services_auth(byte[] clientDataJSON, byte[] attestationObject, String[] transportArray, JSONObject json) throws JSONException {
            clientDataJSON.getClass();
            attestationObject.getClass();
            transportArray.getClass();
            json.getClass();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(getJSON_KEY_CLIENT_DATA$credentials_play_services_auth(), b64Encode(clientDataJSON));
            jSONObject.put(getJSON_KEY_ATTESTATION_OBJ$credentials_play_services_auth(), b64Encode(attestationObject));
            jSONObject.put(getJSON_KEY_TRANSPORTS$credentials_play_services_auth(), new JSONArray(transportArray));
            json.put(getJSON_KEY_RESPONSE$credentials_play_services_auth(), jSONObject);
        }

        public final byte[] b64Decode(String str) {
            str.getClass();
            byte[] bArrDecode = Base64.decode(str, 11);
            bArrDecode.getClass();
            return bArrDecode;
        }

        public final String b64Encode(byte[] data) {
            data.getClass();
            String strEncodeToString = Base64.encodeToString(data, 11);
            strEncodeToString.getClass();
            return strEncodeToString;
        }

        public final GetCredentialException beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth(wr6 code, String msg) {
            code.getClass();
            r rVar = getOrderedErrorCodeToExceptions$credentials_play_services_auth().get(code);
            return rVar == null ? new GetPublicKeyCredentialDomException(new r(26), ij0.i("unknown fido gms exception - ", msg)) : (code == wr6.NOT_ALLOWED_ERR && msg != null && bsg.u0(msg, "Unable to get sync account", false)) ? new GetCredentialCancellationException("Passkey retrieval was cancelled by the user.") : new GetPublicKeyCredentialDomException(rVar, msg);
        }

        public final boolean checkAlgSupported(int alg) {
            try {
                i42.a(alg);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        public final tvd convert(w75 request, Context context) {
            throw null;
        }

        public final tvd convertJSON$credentials_play_services_auth(JSONObject json) throws JSONException, CreatePublicKeyCredentialDomException {
            json.getClass();
            svd svdVar = new svd();
            parseRequiredChallengeAndUser$credentials_play_services_auth(json, svdVar);
            parseRequiredRpAndParams$credentials_play_services_auth(json, svdVar);
            parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth(json, svdVar);
            parseOptionalTimeout$credentials_play_services_auth(json, svdVar);
            parseOptionalAuthenticatorSelection$credentials_play_services_auth(json, svdVar);
            parseOptionalExtensions$credentials_play_services_auth(json, svdVar);
            wvd wvdVar = svdVar.a;
            yvd yvdVar = svdVar.b;
            byte[] bArr = svdVar.c;
            ArrayList arrayList = svdVar.d;
            Double d = svdVar.e;
            ArrayList arrayList2 = svdVar.f;
            e71 e71Var = svdVar.g;
            k31 k31Var = svdVar.h;
            return new tvd(wvdVar, yvdVar, bArr, arrayList, d, arrayList2, e71Var, null, null, k31Var == null ? null : k31Var.E, svdVar.i, null, null);
        }

        public final sh1 convertToPlayAuthPasskeyJsonRequest(d48 option) {
            throw null;
        }

        @lz5
        public final th1 convertToPlayAuthPasskeyRequest(d48 option) {
            throw null;
        }

        public final String getJSON_KEY_ALG$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ALG;
        }

        public final String getJSON_KEY_APPID$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_APPID;
        }

        public final String getJSON_KEY_ATTESTATION$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION;
        }

        public final String getJSON_KEY_ATTESTATION_OBJ$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION_OBJ;
        }

        public final String getJSON_KEY_AUTH_ATTACHMENT$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_ATTACHMENT;
        }

        public final String getJSON_KEY_AUTH_DATA$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_DATA;
        }

        public final String getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_SELECTION;
        }

        public final String getJSON_KEY_CHALLENGE$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE;
        }

        public final String getJSON_KEY_CLIENT_DATA$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_DATA;
        }

        public final String getJSON_KEY_CLIENT_EXTENSION_RESULTS$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_EXTENSION_RESULTS;
        }

        public final String getJSON_KEY_CRED_PROPS$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CRED_PROPS;
        }

        public final String getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME;
        }

        public final String getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_EXCLUDE_CREDENTIALS;
        }

        public final String getJSON_KEY_EXTENSTIONS$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS;
        }

        public final String getJSON_KEY_ICON$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ICON;
        }

        public final String getJSON_KEY_ID$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ID;
        }

        public final String getJSON_KEY_KEY_PROTECTION_TYPE$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_KEY_PROTECTION_TYPE;
        }

        public final String getJSON_KEY_MATCHER_PROTECTION_TYPE$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_MATCHER_PROTECTION_TYPE;
        }

        public final String getJSON_KEY_NAME$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        }

        public final String getJSON_KEY_PUB_KEY_CRED_PARAMS$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_PUB_KEY_CRED_PARAMS;
        }

        public final String getJSON_KEY_RAW_ID$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RAW_ID;
        }

        public final String getJSON_KEY_REQUIRE_RES_KEY$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_REQUIRE_RES_KEY;
        }

        public final String getJSON_KEY_RESPONSE$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
        }

        public final String getJSON_KEY_RES_KEY$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RES_KEY;
        }

        public final String getJSON_KEY_RK$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RK;
        }

        public final String getJSON_KEY_RP$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RP;
        }

        public final String getJSON_KEY_RPID$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RPID;
        }

        public final String getJSON_KEY_SIGNATURE$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE;
        }

        public final String getJSON_KEY_THIRD_PARTY_PAYMENT$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_THIRD_PARTY_PAYMENT;
        }

        public final String getJSON_KEY_TIMEOUT$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT;
        }

        public final String getJSON_KEY_TRANSPORTS$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS;
        }

        public final String getJSON_KEY_TYPE$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
        }

        public final String getJSON_KEY_USER$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        }

        public final String getJSON_KEY_USER_HANDLE$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER_HANDLE;
        }

        public final String getJSON_KEY_USER_VERIFICATION_METHOD$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER_VERIFICATION_METHOD;
        }

        public final LinkedHashMap<wr6, r> getOrderedErrorCodeToExceptions$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions;
        }

        public final void parseOptionalAuthenticatorSelection$credentials_play_services_auth(JSONObject json, svd builder) throws JSONException {
            json.getClass();
            builder.getClass();
            if (json.has(getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth())) {
                JSONObject jSONObject = json.getJSONObject(getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth());
                boolean zOptBoolean = jSONObject.optBoolean(getJSON_KEY_REQUIRE_RES_KEY$credentials_play_services_auth(), false);
                String strOptString = jSONObject.optString(getJSON_KEY_RES_KEY$credentials_play_services_auth(), "");
                strOptString.getClass();
                ome omeVarA = strOptString.length() > 0 ? ome.a(strOptString) : null;
                Boolean boolValueOf = Boolean.valueOf(zOptBoolean);
                String strOptString2 = jSONObject.optString(getJSON_KEY_AUTH_ATTACHMENT$credentials_play_services_auth(), "");
                strOptString2.getClass();
                b21 b21VarA = strOptString2.length() > 0 ? b21.a(strOptString2) : null;
                builder.g = new e71(boolValueOf, b21VarA == null ? null : b21VarA.E, null, omeVarA == null ? null : omeVarA.E);
            }
        }

        public final void parseOptionalExtensions$credentials_play_services_auth(JSONObject json, svd builder) throws JSONException {
            json.getClass();
            builder.getClass();
            if (json.has(getJSON_KEY_EXTENSTIONS$credentials_play_services_auth())) {
                JSONObject jSONObject = json.getJSONObject(getJSON_KEY_EXTENSTIONS$credentials_play_services_auth());
                String strOptString = jSONObject.optString(getJSON_KEY_APPID$credentials_play_services_auth(), "");
                strOptString.getClass();
                builder.i = new x61(strOptString.length() > 0 ? new kh7(strOptString) : null, null, jSONObject.optBoolean("uvm", false) ? new xoi(true) : null, null, null, null, null, null, jSONObject.optBoolean(getJSON_KEY_THIRD_PARTY_PAYMENT$credentials_play_services_auth(), false) ? new v98(true) : null, null, null, null);
            }
        }

        public final void parseOptionalTimeout$credentials_play_services_auth(JSONObject json, svd builder) {
            json.getClass();
            builder.getClass();
            if (json.has(getJSON_KEY_TIMEOUT$credentials_play_services_auth())) {
                builder.e = Double.valueOf(json.getLong(getJSON_KEY_TIMEOUT$credentials_play_services_auth()) / 1000.0d);
            }
        }

        public final void parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth(JSONObject json, svd builder) throws JSONException, CreatePublicKeyCredentialDomException {
            ArrayList arrayList;
            json.getClass();
            builder.getClass();
            ArrayList arrayList2 = new ArrayList();
            if (json.has(getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth())) {
                JSONArray jSONArray = json.getJSONArray(getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth());
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String string = jSONObject.getString(getJSON_KEY_ID$credentials_play_services_auth());
                    string.getClass();
                    byte[] bArrB64Decode = b64Decode(string);
                    String string2 = jSONObject.getString(getJSON_KEY_TYPE$credentials_play_services_auth());
                    string2.getClass();
                    if (string2.length() == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor type value is not found or unexpectedly empty");
                    }
                    if (bArrB64Decode.length == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor id value is not found or unexpectedly empty");
                    }
                    if (jSONObject.has(getJSON_KEY_TRANSPORTS$credentials_play_services_auth())) {
                        arrayList = new ArrayList();
                        JSONArray jSONArray2 = jSONObject.getJSONArray(getJSON_KEY_TRANSPORTS$credentials_play_services_auth());
                        int length2 = jSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            try {
                                arrayList.add(Transport.a(jSONArray2.getString(i2)));
                            } catch (Transport.UnsupportedTransportException e) {
                                throw new CreatePublicKeyCredentialDomException(new r(4), e.getMessage());
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    arrayList2.add(new uvd(string2, bArrB64Decode, arrayList));
                }
            }
            builder.f = arrayList2;
            String strOptString = json.optString(getJSON_KEY_ATTESTATION$credentials_play_services_auth(), "none");
            strOptString.getClass();
            builder.h = k31.a(strOptString.length() != 0 ? strOptString : "none");
        }

        public final void parseRequiredChallengeAndUser$credentials_play_services_auth(JSONObject json, svd builder) throws JSONException {
            json.getClass();
            builder.getClass();
            byte[] challenge = getChallenge(json);
            dgj.v(challenge);
            builder.c = challenge;
            JSONObject jSONObject = json.getJSONObject(getJSON_KEY_USER$credentials_play_services_auth());
            String string = jSONObject.getString(getJSON_KEY_ID$credentials_play_services_auth());
            string.getClass();
            byte[] bArrB64Decode = b64Decode(string);
            String string2 = jSONObject.getString(getJSON_KEY_NAME$credentials_play_services_auth());
            String string3 = jSONObject.getString(getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth());
            String strOptString = jSONObject.optString(getJSON_KEY_ICON$credentials_play_services_auth(), "");
            string3.getClass();
            if (string3.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing displayName or they are unexpectedly empty");
            }
            if (bArrB64Decode.length == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user id or they are unexpectedly empty");
            }
            string2.getClass();
            if (string2.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user name or they are unexpectedly empty");
            }
            builder.b = new yvd(string2, strOptString, string3, bArrB64Decode);
        }

        public final void parseRequiredRpAndParams$credentials_play_services_auth(JSONObject json, svd builder) throws JSONException {
            json.getClass();
            builder.getClass();
            JSONObject jSONObject = json.getJSONObject(getJSON_KEY_RP$credentials_play_services_auth());
            String string = jSONObject.getString(getJSON_KEY_ID$credentials_play_services_auth());
            String strOptString = jSONObject.optString(getJSON_KEY_NAME$credentials_play_services_auth(), "");
            String strOptString2 = jSONObject.optString(getJSON_KEY_ICON$credentials_play_services_auth(), "");
            strOptString2.getClass();
            if (strOptString2.length() == 0) {
                strOptString2 = null;
            }
            strOptString.getClass();
            if (strOptString.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp name is missing or unexpectedly empty");
            }
            string.getClass();
            if (string.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp ID is missing or unexpectedly empty");
            }
            builder.a = new wvd(string, strOptString, strOptString2);
            JSONArray jSONArray = json.getJSONArray(getJSON_KEY_PUB_KEY_CRED_PARAMS$credentials_play_services_auth());
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                int i2 = (int) jSONObject2.getLong(getJSON_KEY_ALG$credentials_play_services_auth());
                String strOptString3 = jSONObject2.optString(getJSON_KEY_TYPE$credentials_play_services_auth(), "");
                strOptString3.getClass();
                if (strOptString3.length() == 0) {
                    throw new JSONException("PublicKeyCredentialCreationOptions PublicKeyCredentialParameter type missing or unexpectedly empty");
                }
                if (checkAlgSupported(i2)) {
                    arrayList.add(new vvd(strOptString3, i2));
                }
            }
            builder.d = arrayList;
        }

        public final CreateCredentialException publicKeyCredentialResponseContainsError(rvd cred) {
            cred.getClass();
            Parcelable parcelable = cred.H;
            if (parcelable == null && (parcelable = cred.I) == null && (parcelable = cred.J) == null) {
                sz6.j("No response set.");
                return null;
            }
            if (!(parcelable instanceof c71)) {
                return null;
            }
            c71 c71Var = (c71) parcelable;
            wr6 wr6Var = c71Var.E;
            wr6Var.getClass();
            r rVar = getOrderedErrorCodeToExceptions$credentials_play_services_auth().get(wr6Var);
            String str = c71Var.F;
            return rVar == null ? new CreatePublicKeyCredentialDomException(new r(26), ij0.i("unknown fido gms exception - ", str)) : (wr6Var == wr6.NOT_ALLOWED_ERR && str != null && bsg.u0(str, "Unable to get sync account", false)) ? new CreateCredentialCancellationException("Passkey registration was cancelled by the user.") : new CreatePublicKeyCredentialDomException(rVar, str);
        }

        public final String toAssertPasskeyResponse(j6g cred) {
            Object obj;
            cred.getClass();
            JSONObject jSONObject = new JSONObject();
            rvd rvdVar = cred.M;
            JSONObject jSONObject2 = null;
            if (rvdVar != null) {
                obj = rvdVar.H;
                if (obj == null && (obj = rvdVar.I) == null && (obj = rvdVar.J) == null) {
                    sz6.j("No response set.");
                    return null;
                }
            } else {
                obj = null;
            }
            obj.getClass();
            if (obj instanceof c71) {
                c71 c71Var = (c71) obj;
                wr6 wr6Var = c71Var.E;
                wr6Var.getClass();
                throw beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth(wr6Var, c71Var.F);
            }
            if (!(obj instanceof a71)) {
                Log.e(PublicKeyCredentialControllerUtility.TAG, "AuthenticatorResponse expected assertion response but got: ".concat(obj.getClass().getName()));
                String string = jSONObject.toString();
                string.getClass();
                return string;
            }
            try {
                c71 c71Var2 = rvdVar.J;
                wik wikVar = rvdVar.G;
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    if (wikVar != null && wikVar.o().length > 0) {
                        jSONObject3.put("rawId", fd9.R(wikVar.o()));
                    }
                    String str = rvdVar.L;
                    if (str != null) {
                        jSONObject3.put("authenticatorAttachment", str);
                    }
                    String str2 = rvdVar.F;
                    if (str2 != null && c71Var2 == null) {
                        jSONObject3.put("type", str2);
                    }
                    String str3 = rvdVar.E;
                    if (str3 != null) {
                        jSONObject3.put("id", str3);
                    }
                    String str4 = "response";
                    a71 a71Var = rvdVar.I;
                    boolean z = true;
                    if (a71Var != null) {
                        jSONObject2 = a71Var.l0();
                    } else {
                        b71 b71Var = rvdVar.H;
                        if (b71Var != null) {
                            jSONObject2 = b71Var.l0();
                        } else {
                            z = false;
                            if (c71Var2 != null) {
                                try {
                                    jSONObject2 = new JSONObject();
                                    jSONObject2.put("code", c71Var2.E.E);
                                    String str5 = c71Var2.F;
                                    if (str5 != null) {
                                        jSONObject2.put("message", str5);
                                    }
                                    str4 = "error";
                                } catch (JSONException e) {
                                    throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e);
                                }
                            }
                        }
                    }
                    if (jSONObject2 != null) {
                        jSONObject3.put(str4, jSONObject2);
                    }
                    y61 y61Var = rvdVar.K;
                    if (y61Var != null) {
                        jSONObject3.put("clientExtensionResults", y61Var.l0());
                    } else if (z) {
                        jSONObject3.put("clientExtensionResults", new JSONObject());
                    }
                    String string2 = jSONObject3.toString();
                    string2.getClass();
                    return string2;
                } catch (JSONException e2) {
                    throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e2);
                }
            } catch (Throwable th) {
                throw new GetCredentialUnknownException("The PublicKeyCredential response json had an unexpected exception when parsing: " + th.getMessage());
            }
        }

        private Companion() {
        }
    }
}

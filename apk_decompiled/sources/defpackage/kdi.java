package defpackage;

import android.os.StatFs;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.UsageCreditsEvents$CreditPackPurchaseFailed;
import com.anthropic.claude.analytics.events.UsageCreditsEvents$CreditPackPurchaseStage;
import com.anthropic.claude.api.account.UpdateAccountRequest;
import com.anthropic.claude.api.artifacts.UserArtifactsListResponse;
import com.anthropic.claude.api.chat.UpdatableChatConversationSettings;
import com.anthropic.claude.api.chat.messages.UnknownContentBlock;
import com.anthropic.claude.api.consent.UserConsentRequest;
import com.anthropic.claude.api.consent.UserConsentResponse;
import com.anthropic.claude.api.experience.UnknownClientAction;
import com.anthropic.claude.api.experience.UnknownContent;
import com.anthropic.claude.api.login.VerifyMagicLinkRequest;
import com.anthropic.claude.app.verification.VerificationScreens;
import com.anthropic.claude.conway.protocol.UserPart;
import com.anthropic.claude.mcpapps.transport.UiResourceCsp;
import com.anthropic.claude.mcpapps.transport.UpdateModelContextParams;
import com.anthropic.claude.tool.model.UserLocationV0InputAccuracy;
import com.anthropic.claude.tool.model.UserLocationV0OutputUserLocationErrorErrorType;
import com.google.android.gms.maps.GoogleMapOptions;
import java.io.File;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import okio.FileSystem;
import okio.JvmSystemFileSystem;
import okio.Path;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kdi implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ kdi(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.E) {
            case 0:
                return UiResourceCsp._childSerializers$_anonymous_();
            case 1:
                return UiResourceCsp._childSerializers$_anonymous_$0();
            case 2:
                return UnknownClientAction._init_$_anonymous_();
            case 3:
                return UnknownContent._init_$_anonymous_();
            case 4:
                return UnknownContentBlock._childSerializers$_anonymous_();
            case 5:
                return UpdatableChatConversationSettings._childSerializers$_anonymous_();
            case 6:
                return UpdateAccountRequest._childSerializers$_anonymous_();
            case 7:
                return UpdateModelContextParams._childSerializers$_anonymous_();
            case 8:
                return UsageCreditsEvents$CreditPackPurchaseFailed._childSerializers$_anonymous_();
            case 9:
                return UsageCreditsEvents$CreditPackPurchaseFailed._childSerializers$_anonymous_$0();
            case 10:
                return UsageCreditsEvents$CreditPackPurchaseStage._init_$_anonymous_();
            case 11:
                return UserArtifactsListResponse._childSerializers$_anonymous_();
            case 12:
                return UserConsentRequest._childSerializers$_anonymous_();
            case 13:
                return UserConsentRequest._childSerializers$_anonymous_$0();
            case 14:
                return UserConsentResponse._childSerializers$_anonymous_();
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return UserConsentResponse._childSerializers$_anonymous_$0();
            case 16:
                GoogleMapOptions googleMapOptions = new GoogleMapOptions();
                googleMapOptions.O = Boolean.TRUE;
                return googleMapOptions;
            case g.MAX_FIELD_NUMBER /* 17 */:
                return UserLocationV0InputAccuracy._init_$_anonymous_();
            case g.AVG_FIELD_NUMBER /* 18 */:
                return UserLocationV0OutputUserLocationErrorErrorType._init_$_anonymous_();
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return UserPart.Unknown._init_$_anonymous_();
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                api apiVar = new api(new dn0(0));
                uvk.d(apiVar, new bz7[]{new r2i(13)}, new r2i(14));
                return new bpi(apiVar.build());
            case 21:
                api apiVar2 = new api(new dn0(0));
                uvk.d(apiVar2, new bz7[]{new r2i(15)}, new r2i(16));
                return new bpi(apiVar2.build());
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                dn0 dn0Var = new dn0(0);
                fnc fncVar = fnc.E;
                dn0Var.g(new u6g(new xe1(new ipi(fncVar))));
                dn0Var.g(new xe1(new fpi(fncVar)));
                ArrayList arrayList = dn0Var.E;
                arrayList.getClass();
                return new bpi(new z52(arrayList));
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffsetId().toFormatter();
            case 24:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHmmss", "Z").toFormatter();
            case BuildConfig.VERSION_CODE /* 25 */:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHMM", "+0000").toFormatter();
            case 26:
                JvmSystemFileSystem jvmSystemFileSystem = FileSystem.E;
                Path pathE = FileSystem.F.e("coil3_disk_cache");
                long jF0 = 10485760;
                try {
                    File file = pathE.toFile();
                    file.mkdir();
                    StatFs statFs = new StatFs(file.getAbsolutePath());
                    jF0 = wd6.f0((long) (0.02d * statFs.getBlockSizeLong() * statFs.getBlockCountLong()), 10485760L, 262144000L);
                    break;
                } catch (Exception unused) {
                }
                return new k4e(jF0, jvmSystemFileSystem, pathE);
            case 27:
                return x44.W(VerificationScreens.EnterPhoneStep.INSTANCE);
            case 28:
                return VerificationScreens.EnterPhoneStep._init_$_anonymous_();
            default:
                return VerifyMagicLinkRequest._childSerializers$_anonymous_();
        }
    }
}

package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.account.Organization;
import com.anthropic.claude.api.account.OrganizationSettings;
import com.anthropic.claude.api.chat.tool.ObjectProperty;
import com.anthropic.claude.api.model.ModelSelectorConfig;
import com.anthropic.claude.api.model.ModelSelectorEntry;
import com.anthropic.claude.api.model.ModelSelectorState;
import com.anthropic.claude.api.model.ModelThinkingDefault;
import com.anthropic.claude.api.project.PaginatedProjectsResponse;
import com.anthropic.claude.login.OverlayScreens;
import com.anthropic.claude.tool.model.PhoneCallCompletedOutput;
import com.anthropic.claude.tool.model.PlacesMapDisplayV0Input;
import com.anthropic.claude.tool.model.PlacesMapDisplayV0Output;
import com.anthropic.router.panes.Panes;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oob implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ oob(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.E) {
            case 0:
                return ModelSelectorConfig._childSerializers$_anonymous_();
            case 1:
                return ModelSelectorEntry._childSerializers$_anonymous_();
            case 2:
                return ModelSelectorEntry._childSerializers$_anonymous_$0();
            case 3:
                return ModelSelectorEntry._childSerializers$_anonymous_$1();
            case 4:
                return ModelSelectorEntry._childSerializers$_anonymous_$2();
            case 5:
                return ModelSelectorEntry._childSerializers$_anonymous_$3();
            case 6:
                return ModelSelectorEntry._childSerializers$_anonymous_$4();
            case 7:
                return ModelSelectorState._childSerializers$_anonymous_();
            case 8:
                return ModelSelectorState._childSerializers$_anonymous_$0();
            case 9:
                return ModelThinkingDefault._childSerializers$_anonymous_();
            case 10:
                return m52.a;
            case 11:
                return xdi.a;
            case 12:
                el5 el5Var = new el5(16);
                el5Var.q("http://localhost/");
                el5Var.E = new t82() { // from class: z1c
                    @Override // defpackage.t82
                    public final v82 a(kie kieVar) {
                        kieVar.getClass();
                        throw new IllegalStateException("preview Retrofit — no network calls");
                    }
                };
                return el5Var.r();
            case 13:
                return ObjectProperty._childSerializers$_anonymous_();
            case 14:
                return ObjectProperty._childSerializers$_anonymous_$0();
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return Organization._childSerializers$_anonymous_();
            case 16:
                return Organization._childSerializers$_anonymous_$0();
            case g.MAX_FIELD_NUMBER /* 17 */:
                return OrganizationSettings._childSerializers$_anonymous_();
            case g.AVG_FIELD_NUMBER /* 18 */:
                return OverlayScreens.None._init_$_anonymous_();
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return iei.a;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return new hmc();
            case 21:
                return PaginatedProjectsResponse._childSerializers$_anonymous_();
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                xe4 xe4Var = aqc.a;
                return pp5.a;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return Panes._childSerializers$_anonymous_();
            case 24:
                return PhoneCallCompletedOutput._childSerializers$_anonymous_();
            case BuildConfig.VERSION_CODE /* 25 */:
                return PlacesMapDisplayV0Input._childSerializers$_anonymous_();
            case 26:
                return PlacesMapDisplayV0Input._childSerializers$_anonymous_$0();
            case 27:
                return PlacesMapDisplayV0Output._childSerializers$_anonymous_();
            case 28:
                ft5 ft5Var = g86.a;
                return vr5.G;
            default:
                int i = wad.a;
                return Boolean.FALSE;
        }
    }
}

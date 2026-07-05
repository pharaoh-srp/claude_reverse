package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ju6 {
    public static final zb0 a(yi3 yi3Var, ld4 ld4Var) {
        e18 e18Var;
        int i;
        int i2;
        switch (yi3Var.ordinal()) {
            case 0:
                e18Var = (e18) ld4Var;
                i = R.string.error_unknown;
                i2 = 682556284;
                break;
            case 1:
                e18Var = (e18) ld4Var;
                i = R.string.error_invalid_phone_number;
                i2 = 682492105;
                break;
            case 2:
                e18Var = (e18) ld4Var;
                i = R.string.error_unsupported_phone_number;
                i2 = 682501965;
                break;
            case 3:
                e18Var = (e18) ld4Var;
                i = R.string.error_phone_number_temp_blocked;
                i2 = 682496910;
                break;
            case 4:
                e18Var = (e18) ld4Var;
                i = R.string.error_expired_verification;
                i2 = 682506729;
                break;
            case 5:
                e18Var = (e18) ld4Var;
                i = R.string.error_verification_failed;
                i2 = 682511336;
                break;
            case 6:
                e18Var = (e18) ld4Var;
                i = R.string.error_phone_number_already_used;
                i2 = 682515694;
                break;
            case 7:
                e18Var = (e18) ld4Var;
                i = R.string.error_must_upgrade;
                i2 = 682520225;
                break;
            case 8:
                e18Var = (e18) ld4Var;
                i = R.string.error_invalid_code;
                i2 = 682524353;
                break;
            case 9:
                e18Var = (e18) ld4Var;
                i = R.string.error_invalid_email;
                i2 = 682542114;
                break;
            case 10:
                e18Var = (e18) ld4Var;
                i = R.string.error_email_already_registered;
                i2 = 682546669;
                break;
            case 11:
                e18Var = (e18) ld4Var;
                i = R.string.error_prompt_is_too_long;
                i2 = 682560359;
                break;
            case 12:
                e18Var = (e18) ld4Var;
                i = R.string.error_purchase_token_used;
                i2 = 682551656;
                break;
            case 13:
                e18Var = (e18) ld4Var;
                i = R.string.error_magic_link_used;
                i2 = 682528836;
                break;
            case 14:
                e18Var = (e18) ld4Var;
                i = R.string.error_magic_link_expired;
                i2 = 682533255;
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                e18Var = (e18) ld4Var;
                i = R.string.error_magic_link_invalid;
                i2 = 682537767;
                break;
            case 16:
                e18Var = (e18) ld4Var;
                i = R.string.error_chat_image_limit_reached;
                i2 = 682565357;
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                e18Var = (e18) ld4Var;
                i = R.string.error_conversation_busy;
                i2 = 682570214;
                break;
            default:
                throw ebh.u((e18) ld4Var, 682491542, false);
        }
        return qy1.f(e18Var, i2, i, e18Var, false);
    }
}

package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gt4 {
    public static final Map a = sta.h0(new cpc("text", new h15("string", null)), new cpc("save", new h15("boolean", null)));

    public static final String a(String str, JsonObject jsonObject) {
        JsonElement jsonElement = (JsonElement) jsonObject.get((Object) str);
        if (jsonElement != null) {
            return ch9.j(jsonElement).getContent();
        }
        return null;
    }

    public static final lqa b(Context context, us4 us4Var, f15 f15Var, rz7 rz7Var, rz7 rz7Var2, bz7 bz7Var, sm smVar) {
        context.getClass();
        us4Var.getClass();
        lqa lqaVar = new lqa();
        tp4 tp4Var = null;
        int i = 0;
        lqaVar.put("conway_confirm_webhook", new a15(ex4.a("conway_confirm_webhook", "Internal: prompt the user to confirm webhook creation and mint a public URL.", sta.h0(new cpc("trigger_word", tqh.D()), new cpc("label", tqh.D())), x44.X("trigger_word", "label")), new et4(rz7Var2, tp4Var, i)));
        nm6 nm6Var = nm6.E;
        lm6 lm6Var = lm6.E;
        lqaVar.put("conway_list_webhooks", new a15(ex4.a("conway_list_webhooks", "Internal: list the user's existing Conway webhooks (token, url, name, enabled, source).", nm6Var, lm6Var), new i01(3, tp4Var, bz7Var)));
        int i2 = 1;
        if (smVar != null) {
            Map mapSingletonMap = Collections.singletonMap("query", tqh.D());
            mapSingletonMap.getClass();
            lqaVar.put("conway_suggest_connectors", new a15(ex4.a("conway_suggest_connectors", "Search the connector directory and return matching connectors the user can connect. Use this when the user asks to connect a service (e.g. Linear, Google Calendar) or asks what connectors are available. The client will render Connect buttons; after the user connects, the connector's tools become available to you automatically.", mapSingletonMap, lm6Var), new yu2(smVar, tp4Var, i2)));
        }
        rh9 rh9Var = new rh9();
        mpk.U(rh9Var, "name", "conway_suggest_actions");
        mpk.U(rh9Var, "description", "Render tappable quick-action buttons for the choices you just offered the user. Call this at the END of a turn where you ask the user to pick between a small number of short replies (e.g. \"say 1, 2, 3, or merge\"). Each button, when tapped, appends its message to the composer so the user can edit or send it. Do not use for open-ended questions, long messages, or anything destructive that needs the user to type explicit confirmation.");
        mpk.W(rh9Var, "input_schema", new fc4(18));
        int i3 = 2;
        lqaVar.put("conway_suggest_actions", new a15(rh9Var.a(), new bj(i3, tp4Var, 6)));
        lqaVar.put("mobile_notify", new a15(ex4.a("mobile_notify", "Show a local notification to the user", sta.h0(new cpc("title", tqh.D()), new cpc("body", tqh.D())), x44.W("title")), new et4(rz7Var, tp4Var, i2)));
        Map mapSingletonMap2 = Collections.singletonMap("type", new h15("string", x44.X("success", "warning", "error", "light", "medium", "heavy")));
        mapSingletonMap2.getClass();
        lqaVar.put("mobile_haptic", new a15(ex4.a("mobile_haptic", "Play a haptic feedback pattern on the device", mapSingletonMap2, x44.W("type")), new ft4(context, tp4Var, i)));
        c61 c61Var = us4Var.d;
        if (c61Var != null) {
        }
        lqaVar.put("mobile_device_info", new a15(ex4.a("mobile_device_info", "Get device model, OS version, locale, and timezone. No permissions required.", nm6Var, lm6Var), new vj(i3, tp4Var, 7)));
        Map mapSingletonMap3 = Collections.singletonMap("accuracy", new h15("string", x44.X("coarse", "fine")));
        mapSingletonMap3.getClass();
        lqaVar.put("mobile_get_location", new a15(ex4.a("mobile_get_location", "Get the device's current location. Prompts the user for permission on first use.", mapSingletonMap3, lm6Var), new t74(f15Var, us4Var, tp4Var, 9)));
        lqaVar.put("mobile_calendar_read", new a15(ex4.a("mobile_calendar_read", "Read calendar events between two ISO-8601 timestamps. Prompts for permission on first use.", sta.h0(new cpc("start", tqh.D()), new cpc("end", tqh.D())), x44.X("start", "end")), new tm(f15Var, us4Var, tp4Var, 29)));
        lqaVar.put("mobile_calendar_create", new a15(ex4.a("mobile_calendar_create", "Create a calendar event. start/end are ISO-8601. Prompts the user for confirmation on every use.", sta.h0(new cpc("title", tqh.D()), new cpc("start", tqh.D()), new cpc("end", tqh.D()), new cpc("notes", tqh.D())), x44.X("title", "start", "end")), new b9(f15Var, us4Var, tp4Var, 11)));
        return lqaVar.c();
    }

    public static final lqa c(Context context) {
        context.getClass();
        tp4 tp4Var = null;
        vj vjVar = new vj(2, tp4Var, 8);
        lqa lqaVarB = b(context, us4.e, new f15(), new n23(context, tp4Var, 1), new ho3(3, null, 3), new wj(1, null, 2), null);
        Set setZ0 = mp0.Z0(new String[]{"mobile_notify", "mobile_haptic", "mobile_device_info", "conway_suggest_actions"});
        lqa lqaVar = new lqa();
        for (Map.Entry entry : (mqa) lqaVarB.entrySet()) {
            String str = (String) entry.getKey();
            a15 a15Var = (a15) entry.getValue();
            if (!setZ0.contains(str)) {
                a15Var = new a15(a15Var.a, vjVar);
            }
            lqaVar.put(str, a15Var);
        }
        if (!lqaVar.containsKey("mobile_speak")) {
            lqaVar.put("mobile_speak", new a15(ex4.a("mobile_speak", "Speak the given text aloud on the user's device using their preferred Claude voice and speed. Use for hands-free operation (driving, cooking, etc.) when the user wants responses read aloud. Returns immediately once playback starts; a new call interrupts any in-progress speech. Keep text concise and conversational. Pass save:true to also export the speech as a WAV file in the device's Downloads folder (Android 10+); the result's saving_to names the file, which is finalized when speech finishes. If playback is interrupted the file keeps the audio captured so far; if no audio plays at all (e.g. audio focus denied) the file is discarded rather than saved empty.", a, x44.W("text")), vjVar));
        }
        return lqaVar.c();
    }

    public static final String d(String str, JsonObject jsonObject) {
        String content;
        Object obj = jsonObject.get((Object) str);
        JsonPrimitive jsonPrimitive = obj instanceof JsonPrimitive ? (JsonPrimitive) obj : null;
        if (jsonPrimitive != null) {
            if (!jsonPrimitive.isString()) {
                jsonPrimitive = null;
            }
            if (jsonPrimitive != null && (content = jsonPrimitive.getContent()) != null && !bsg.I0(content)) {
                return content;
            }
        }
        return null;
    }
}

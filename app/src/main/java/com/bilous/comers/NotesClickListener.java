package com.bilous.comers;

import androidx.cardview.widget.CardView;

import com.bilous.comers.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}

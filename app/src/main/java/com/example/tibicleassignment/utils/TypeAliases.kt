package com.example.tibicleassignment.utils

import android.view.View

typealias OnRecyclerViewItemClickListener<model> = (view : View, position : Int, model : model) -> Unit
